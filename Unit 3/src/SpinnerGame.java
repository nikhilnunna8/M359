import java.sql.SQLOutput;

public class SpinnerGame {
    //Part a
    public int spin(int max, int min){
        return (int)(Math.random() * (max - min + 1) + min);
    }
    // part b

    public void playRound(){
        int pRand = spin(1, 10);
        int cRand = spin(2,8);
        int pts = 0;
        if (pRand > cRand){
            pts = Math.abs(pRand - cRand);
            System.out.println("You win! " + pts + " points.");
        }
        else if (pRand < cRand){
            pts = Math.abs(pRand - cRand);
            System.out.println("You lose! " + pts + " points.");
        }
        else{
            int pRand2 = spin(1, 10);
            int cRand2 = spin(2,8);
            if (pRand == cRand){
                pts += 1;
                System.out.println("Tie. 1 point");
            }
            else if ((pRand + pRand2) >(cRand2 + cRand)){
                System.out.println("You win! 1 pt");
            }
            else{
                System.out.println("You lose -1 pt");
            }
        }

    }
}
