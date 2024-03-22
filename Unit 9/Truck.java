// Teacher: Mister Anthony DeStephano
// Students: The Nikhil Nunna, The Mantra Mittal
// Period 2
public class Truck extends Automobile{
    private String companyWorkFor;
    private boolean cargo;
    private int cargoSpace;


    public Truck(double mileage, String brand, double price, String company, boolean c){
        super(mileage, brand, 6, 2, price);
        companyWorkFor = company;
        cargo = c;
        if(cargo){
            cargoSpace = 10; //Ubox Containers
        }
    }
    public String toString(){
        return super.toString() + "\n This truck belongs to the company " + companyWorkFor;
    }
    /**
     * Calculates the repair cost for the truck class.
     *
     * @return The repair cost as a double containing whether if the vehicle has been in a crash and calculates
     *         the repair cost based on the amount of cargoSpace and the Automobile Class's repairCost(). If the vehicle is not in a crash,
     *         or if it's not a cargo vehicle, the repair cost is just the Automobile class's repairCost method.
     */
    public double repairCost(){
        boolean y = super.inCrash();
        if(y) {
            if (cargo) {
                return (super.repairCost(y) + (10 * cargoSpace));

            }
            return super.repairCost(y);
        }
        return 0.00;
    }
    /**
     * Fills the cargo space of the truck with the specified number of boxes.
     *
     * @param numBoxes The number of boxes to fill the cargo space with.
     *                 If the cargo space of the truck is less than this number,
     *                 a message is printed indicating insufficient space.
     */
    public void fillCargo(int numBoxes){
        if(cargo){
            if(numBoxes > cargoSpace){
                System.out.println("The Truck doesn't have enough space");
            }
            else{
                cargoSpace -= numBoxes;
            }

        }

    }

}
