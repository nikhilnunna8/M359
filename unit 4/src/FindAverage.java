import java.util.Scanner;
public class FindAverage {
    public static void main(String[] args) {
        int numScores = 0;
        int runningTotal = 0;
        int testScore = 0;
        double average = 0.0;
        Scanner scan = new Scanner(System.in);
        while (testScore != -1){
            System.out.println("Enter test score (-1 to quit): ");
            testScore = scan.nextInt();
            if (testScore != -1) {
                numScores++;
                runningTotal += testScore;
                average = (double) runningTotal / numScores;
            }
        }
        System.out.println("The average for " + numScores + " test(s) is " + average);
    }
}
