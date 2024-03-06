import java.util.ArrayList;
import java.util.Scanner;
public class studentDriver {
    private int[][] arr;
    private ArrayList<String> listNames;
    public studentDriver(String[] stuName, int rows, int cols){
        arr = new int[rows][cols];
        listNames = new ArrayList<String>();
        for (String i: stuName) {
            listNames.add(i);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many students: ");
        int numStudents = scan.nextInt();
        System.out.println("How many tests: ");
        int numTests = scan.nextInt();
        for (int i = 0; i < numStudents; i++){

        }
    }
}
