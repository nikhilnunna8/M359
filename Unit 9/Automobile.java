// Lead Artist: Mister Anthony DeStephano
// Producers/Prodigies: The Nikhil Nunna, The Mantra Mittal
// Scene 2
public class Automobile {
    //preworkout buffet
    private double price;
    private double mileage;
    private int wheelNum, doorNum;
    private String brand;
    public Automobile (double m, String b, double p){
        wheelNum = 4;
        doorNum = 4;
        mileage = m;
        brand = b;
        price = p;
    }
    public Automobile (double m, String b, int w, int d, double p){
        wheelNum = w;
        doorNum = d;
        mileage = m;
        brand = b;
        price = p;
    }
    public static boolean inCrash(){
        if(Math.random() < 0.5){
            return true;
        }
        System.out.println("\nThis car is safe.");
        return false;
    }
    public double repairCost(boolean y){
        if(y){
            System.out.println("Your vehicle was in a crash!");
            System.out.print("The cost of the repair in dollars is: ");
            if(mileage > 20000){
                return price*.05;
            }
            if(mileage < 1000){
                return price *.1;
            }
        return price*.075;
        }

        return 0.00;
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
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public int getWheelNum() {
        return wheelNum;
    }

    public void setWheelNum(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public int getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
