import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter in a non-negative integer to get its factorial. ");
        int num = scan.nextInt();
        while (num < 0){
            System.out.println("A non-negative number is required. Enter another number:");
            num = scan.nextInt();
        }
        int answer = 1;
        while (num != 0){
            answer *= num;
            num--;
        }
        System.out.println("Answer is: " + answer);

    }
}
