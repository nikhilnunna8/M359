public class AutombileTester {
    public static void main(String[] args) {
        Automobile[][] highwayLine = new Automobile[3][4];

        highwayLine[0][0] = new Car(96000, "BMW", 4, true);
        highwayLine[0][1] = new Truck(300000, "Mack", 12 , "FEDEX", true                 );
        highwayLine[0][2] = new Van(50, "Honda",0, "Smith", false);
        highwayLine[0][3] = new Automobile(10000, "Lamborghini Tractor",39);
        highwayLine[1][0] = new Car(0, "Toyota", 0);
        highwayLine[1][1] = new Truck(500000, "Peterbilt", 56, "Amazon", true);
        highwayLine[1][2] = new Automobile(12000, "Mitsubishi", 6, 6, 4);
        highwayLine[1][3] = new Truck(37, "Volvo", 0, "UPS", false);
        highwayLine[2][0] = new Car(25, "Bugatti", 0, true);
        highwayLine[2][1] = new Van(100000, "Honda", 5, "Doe", false);
        highwayLine[2][2] = new Van(0, "Chrysler", 0,"Smith", false);
        highwayLine[2][3] = new Van(124, "Mercedes-Benz Van", 1, "LBJames", true);
        System.out.println(highwayLine[1][1].repairCost());
    }
    public static void highestRepairCost(Automobile[][] autoArray){
        double highest = 0.0;
        Automobile highestCar = autoArray[0][0];
        for (int i = 0; i < autoArray.length; i++) {
            for (int j = 0; j < autoArray[0].length; j++)
            if (autoArray[i][j].repairCost() > highest){
                highest = autoArray[i][j].repairCost();
                highestCar = autoArray[i][j];
            }
        }
        System.out.println("Information of the car with the highest repair cost: \n" + highestCar.toString() + "/n The repair cost of this car is $" +
                highest);
    }
}
