import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class TicketMasterDriver {
    public static void main(String[] args) throws FileNotFoundException {
        final int ONE = 1;
        final int TWO = 2;
        final int THREE = 3;
        final int FOUR = 4;
        final int FIVE = 5;
        final int SIX = 6;
        TicketMaster t1 = new TicketMaster();
        t1.readInData();
        boolean gameActive = true;
        while(gameActive) {
            boolean choice = false;
            int sortingChoice = -1;
            while (!choice) {
                try {
                    System.out.println("Select sorting method. \n 1. Sort A-Z (Performer) \n 2. Sort Z-A (Performer) \n 3. Sort by ticket price low-high \n" +
                            " 4. Sort by ticket price high-low \n 5. Search by city \n 6. Quit");
                    sortingChoice = TicketMaster.in.nextInt();
                    if ((sortingChoice <= 6) && (sortingChoice >= 1)) {
                        choice = true;
                    } else {
                        System.out.println("\nYour choice number is either too high or too low. It needs to be 1-6. \n");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("\nInvalid entry. Please enter an Integer.\n");
                    TicketMaster.in.nextLine();
                }
            }
            if (sortingChoice == ONE){
                t1.sortByPerformerAZ();
                System.out.println(t1);
            }
            if (sortingChoice == TWO){
                t1.sortByPerformerZA();
                System.out.println(t1);
            }
            if (sortingChoice == THREE){
                t1.sortByPriceLowToHigh();
                System.out.println(t1);
            }
            if (sortingChoice == FOUR){
                t1.sortByPriceHighToLow();
                System.out.println(t1);
            }
            if (sortingChoice == FIVE) {
                System.out.println("What city are you looking to search concerts in?");
                TicketMaster.in.nextLine();
                String temp = TicketMaster.in.nextLine();
                ArrayList<Show> temp2 = t1.searchByCity(temp);
                if (temp2.size() == 0) {
                    System.out.println("Sorry! There are no concerts in that city at this time.");
                } else {
                    for (Show a: temp2) {
                        System.out.println(a);
                    }
                }
            }
            if (sortingChoice == SIX){
                gameActive = false;
            }
        }

    }
}
