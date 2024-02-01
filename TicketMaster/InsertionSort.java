import java.util.ArrayList;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(3);
        test.add(4);
        test.add(1);
        test.add(6);
        test.add(4);
        insert(test);
    }
    public static void insert(ArrayList<Integer> test){
        for (int i = 1; i < test.size(); i++) {
            int tempValue = test.get(i);
            int temp = i;
            while ((temp > 0) && (test.get(temp - 1) > tempValue)){
                test.set(temp, test.get(temp - 1));
                temp--;
            }
            test.set(temp, tempValue);
        }
        System.out.println(test);
    }
}
