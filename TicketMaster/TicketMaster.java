import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class TicketMaster {
    private ArrayList<Show> list;
    public static Scanner in;
    public TicketMaster(){
        list = new ArrayList<Show>();
        in = new Scanner(System.in);
    }
    File myFile = new File("showData.txt");
    public void readInData() throws java.io.FileNotFoundException{
        Scanner s1 = new Scanner(myFile);
        for (int j = 0; j < 24; j++) {
            String date = s1.next();
            double price = Double.parseDouble(s1.next());
            int quantity = Integer.parseInt(s1.next());
            String performer = "";
            String city = "";
            String split = s1.nextLine();
            for (int i = 0; i < split.indexOf(","); i++) {
                performer += split.substring(i, i + 1);
            }
            String temp = performer + ", ";
            city = split.replace(temp, "");
            list.add(new Show(date, price, quantity, performer, city));
        }
        s1.close();
    }
    public ArrayList<Show> searchByCity(String specifiedCity){
        ArrayList<Show> out = new ArrayList<>();
        for (Show s: list) {
           if (s.getCity().equals(specifiedCity)){
               out.add(s);
           }
        }        return out;
    }
    public void sortByPerformerAZ(){
        int minIndex = 0;
        for (int i = 0; i < list.size()-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getPerformer().compareTo(list.get(minIndex).getPerformer()) < 0){
                    minIndex = j;
                }
            }
            Show temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
    public void sortByPerformerZA(){
        int minIndex = 0;
        for (int i = 0; i < list.size()-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).getPerformer().compareTo(list.get(minIndex).getPerformer()) > 0){
                    minIndex = j;
                }
            }
            Show temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }
    public void sortByPriceLowToHigh(){
        for (int i = 1; i < list.size(); i++) {
            Show tempValue = list.get(i);
            int temp = i;
            while ((temp > 0) && (list.get(temp - 1).getPrice() > tempValue.getPrice())){
                list.set(temp, list.get(temp - 1));
                temp--;
            }
            list.set(temp, tempValue);
        }
    }
    public void sortByPriceHighToLow(){
        for (int i = 1; i < list.size(); i++) {
            Show tempValue = list.get(i);
            int temp = i;
            while ((temp > 0) && (list.get(temp - 1).getPrice() < tempValue.getPrice())){
                list.set(temp, list.get(temp - 1));
                temp--;
            }
            list.set(temp, tempValue);
        }
    }
    public String toString(){
        String out = "";
        for (Show s: list) {
             out += s.toString() + "\n";
        }
        return out;
    }
}
