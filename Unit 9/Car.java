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
    public double repairCost(){
        double x = super.repairCost(super.inCrash());
        if(sport){
            x *=10;
        }
        return x;
    }
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
