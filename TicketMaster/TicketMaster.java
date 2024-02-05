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

    /**
     *
     * @throws java.io.FileNotFoundException
     */
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

    /**
     * Displays all the shows in the specifiedCity by comparing the show objects city to the parameter city.
     * @param specifiedCity The city that the user wishes to look for cities in.
     * @return A ArrayList with show objects that are all in the specifiedCity
     */
    public ArrayList<Show> searchByCity(String specifiedCity){
        String x = specifiedCity.toLowerCase();
        ArrayList<Show> out = new ArrayList<>();
        for (Show s: list) {
           if (s.getCity().toLowerCase().equals(x)){
               out.add(s);
           }
        }        return out;
    }

    /**
     * Utilizes a selection sort algorithm to sort the TicketMaster list alphabetically by performer name by utilizing
     * the .compareTo() string method.
     */
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

    /**
     * Utilizes a selection sort algorithm to sort the TicketMaster list reversed alphabetically by performer name by utilizing
     * the .compareTo() string method.
     */
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

    /**
     * Utilizes an insertion sort algorithm to sort the TicketMaster list by lowest to
     * highest price by shifting and inserting the shows inside the list.
     */
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

    /**
     * Utilizes an insertion sort algorithm to sort the TicketMaster list by highest to
     * lowest price by shifting and inserting the shows inside the list.
     */
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
    /**
     * Loops through every show object in a TicketMaster list and prints the toString method
     * of each show object.
     * @return String containing a formatted output
     */
    public String toString(){
        String out = "";
        for (Show s: list) {
             out += s.toString() + "\n";
        }
        return out;
    }
}
