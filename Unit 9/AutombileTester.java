// Teacher: Mr.DeStephano
// Students: The Nikhil Nunna, The Mantra Mittal
// Period 2
// These Automobile classes simulate a highway crash scenario and is intended to show the repair costs of cars currently on the highway.
public class AutombileTester {
    public static void main(String[] args) {
        Automobile[][] highwayLine = new Automobile[3][4];

        highwayLine[0][0] = new Car(96000, "BMW", 25000, true);
        highwayLine[0][1] = new Truck(100000, "Mack", 120000 , "FEDEX", true);
        highwayLine[0][2] = new Van(50, "Honda",41300, "Smith", false);
        highwayLine[0][3] = new Automobile(10000, "Lamborghini Tractor",84880);
        highwayLine[1][0] = new Car(0, "Toyota", 26420);
        highwayLine[1][1] = new Truck(500000, "Peterbilt", 144900, "Amazon", true);
        highwayLine[1][2] = new Automobile(12000, "Mitsubishi", 6, 6, 21950);
        highwayLine[1][3] = new Truck(1370, "Volvo", 206898, "UPS", false);
        highwayLine[2][0] = new Car(25, "Bugatti", 2300000, true);
        highwayLine[2][1] = new Van(100000, "Honda", 14007, "Doe", false);
        highwayLine[2][2] = new Van(0, "Chrysler", 40000,"Xander Lutz", false);
        highwayLine[2][3] = new Van(124, "Mercedes-Benz Van", 52000, "LBJames", true);

        for(Automobile[] a: highwayLine){
            for(Automobile b: a){
                System.out.println();
                System.out.println(b);
                System.out.println(b.repairCost(Automobile.inCrash()));
                System.out.println();
            }
        }

    }
    public static void highestRepairCost(Automobile[][] autoArray){
        double highest = 0.0;
        Automobile highestCar = autoArray[0][0];
        for (int i = 0; i < autoArray.length; i++) {
            for (int j = 0; j < autoArray[0].length; j++)
            if (autoArray[i][j].repairCost(true) > highest){
                highest = autoArray[i][j].repairCost(true);
                highestCar = autoArray[i][j];
            }
        }
        System.out.println("Information of the car with the highest repair cost: \n" + highestCar.toString() + "/n The repair cost of this car is $" +
                highest);
    }
}
