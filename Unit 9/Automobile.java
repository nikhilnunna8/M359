// Lead Artist: Mister Anthony DeStephano
// Producers/Prodigies: The Nikhil Nunna, The Mantra Mittal
// Scene 2
public class Automobile {
    //preworkout buffet
    private double mileage;
    private int wheelNum, doorNum, age;
    private String brand;
    public Automobile (double m, String b, int a){
        wheelNum = 4;
        doorNum = 4;
        mileage = m;
        brand = b;
        age = a;
    }
    public Automobile (double m, String b, int w, int d, int a){
        wheelNum = w;
        doorNum = d;
        mileage = m;
        brand = b;
        age = a;
    }
    public boolean inCrash(){
        if(Math.random() < .3){
            return true;
        }
        return false;
    }
    public double repairCost(){
        if(inCrash()){
            if(mileage < 100){
                double totCost = (wheelNum * doorNum * 5000)/(age+2);
                return totCost;
            }
            double totCost = (wheelNum * doorNum * 5000)/(age*mileage *.1);
            return totCost;
        }
        return 0;
    }
    public String toString(){
        String out = "";
        out += "This Automobile has " + wheelNum + " wheels and " + doorNum + " doors.";
        out += "\nThe Brand is " + brand + " and it has been driven for " + mileage + " miles.";
        return out;
    }
    public double getMileage() {
        return mileage;
    }
}
