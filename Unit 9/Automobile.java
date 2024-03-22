// Teacher: Mister Anthony DeStephano
// Students: The Nikhil Nunna, The Mantra Mittal
// Period 2
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
    /**
     * Simulates whether a vehicle is involved in a crash with a crash rate of 50%.
     *
     * @return true if the vehicle is in a crash,
     *         false otherwise.
     */
    public static boolean inCrash(){
        if(Math.random() < 0.5){
            return true;
        }
        System.out.println("\nThis car is safe.");
        return false;
    }
    /**
     * Calculates the repair cost for the Automobile based on the boolean indicating if it was in a crash or not.
     * @param y A boolean indicating whether the Automobile was in a crash.
     * @return The repair cost as a double value. If the vehicle was in a crash, the repair
     *         cost is calculated based on the vehicle's price and mileage and outputs a message. If the vehicle
     *         was not in a crash, the repair cost is $0.00.
     */
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
    /**
     * Returns a string containing information of the Automobile.
     * @return A string formatted to have the wheels, doorNum, brand, and mileage of the Automobile.
     */
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
