import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(5);
        selectionSort(list);
    }
    public static void selectionSort(ArrayList<Integer> a){
        int minIndex = 0;
        for (int i = 0; i < a.size()-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(j) < a.get(minIndex)){
                    minIndex = j;
                }
            }
            Integer temp = a.get(i);
            a.set(i, a.get(minIndex));
            a.set(minIndex, temp);
        }
        System.out.println(a);
    }
}
