// Teacher: Mister Anthony DeStephano
// Students: The Nikhil Nunna, The Mantra Mittal
// Period 2
public class Car extends Automobile{
    private boolean sport;
    public Car(double m, String b, double p, boolean s){
        super(m,b,p);
        sport = s;
        if(sport == true){
            super.setDoorNum(2);
        }
    }
    public Car(double m, String b, double p){
        super(m,b,4,4,p);
        sport = false;
    }
    /**
     * Calculates the repair cost for the car based on if the vehicle is a sport vehicle or not.
     *
     * @return The repair cost as a double value. If the vehicle was in a crash,
     *         the repair cost is calculated using the Automobile's repairCost method. If the vehicle
     *         is a sport vehicle, the repair cost is multiplied by 10.
     */
    public double repairCost(){
        double x = super.repairCost(super.inCrash());
        if(sport){
            x *=10;
        }
        return x;
    }
    /**
     * Returns a string with information about the car using the super getter methods.
     *
     * @return A string containing information about the car, including mileage,
     *         brand, and whether it's a sport car or a regular car.
     */
    public String toString(){
        String out = "";
        if(sport) {
            out += "This Car has " + super.getMileage() + " miles and has 2 doors.";
            out += "\nThe Brand is " + super.getBrand() + " and it's a sport car.";
        }
        else{
            out += "This Car has " + super.getMileage() + " miles and has 4 doors.";
            out += "\nThe Brand is " + super.getBrand() + " and it's a regular car.";
        }
        return out;
    }
}
