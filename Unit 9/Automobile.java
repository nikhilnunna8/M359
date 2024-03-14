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
        if(Math.random() < 0.5){
            return true;
        }
        return true;
    }
    public double repairCost(){
        if(inCrash()){
            System.out.println("Your vehicle was in a crash!");
//            if(mileage < 100){
//                if(age == 0) {
//                    double totCost = (wheelNum * doorNum * 5000) / (age + 10);
//                    return totCost;
//                }
//            }
//            if(age > 10) {
//                double totCost = (wheelNum * doorNum * 5000) / (mileage * .001);
//                return totCost;
//            }
//            if(age == 0) {
//                double totCost = (wheelNum * doorNum * 5000) / ((age+1) * mileage * .001);
//                return totCost;
//            }
//            double totCost = (wheelNum * doorNum * 5000) / (mileage * .001) - (age*100);
//            return totCost;
            if(age>10){
                return (mileage*10)/(doorNum*wheelNum);
            }
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
