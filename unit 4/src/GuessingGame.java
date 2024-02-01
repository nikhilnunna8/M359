import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        boolean wantToPlay = true;
        while (wantToPlay){
            Scanner scan = new Scanner(System.in);
            int guess = 0;
            int rand = (int) (Math.random() * 100 + 1);
            int tries = 0;
            int triesHigh = 0;
            int triesLow = 0;
            //test if code works
            //System.out.println(rand);
            while (guess != rand) {
                System.out.println("Guess a integer between 1 and 100 inclusive: ");
                tries++;
                guess = scan.nextInt();
                if (guess < rand) {
                    System.out.println("Guess higher!");
                    triesLow++;
                } else if (guess > rand) {
                    System.out.println("Guess lower!");
                    triesHigh++;
                }
            }
            System.out.println("Great Job! You guessed the number in " + tries + " tries! " + triesHigh + " is how many" +
                    " times you guessed high. " + triesLow + " is how many time you guessed low.");
            scan.nextLine();
            System.out.println("Do you want to play again (Enter Y or N)");
            String play = scan.nextLine();
            if (play.toLowerCase().equals("y")){
                wantToPlay = true;
            }
            else{
                wantToPlay = false;
            }
        }
    }
}
