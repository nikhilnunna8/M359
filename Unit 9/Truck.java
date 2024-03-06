public class Truck extends Automobile{
    private String companyWorkFor;
    private boolean cargo;
    private int cargoSpace;


    public Truck(double mileage, String brand, int age, String company, boolean c){
        super(mileage, brand, 6, 2, age);
        companyWorkFor = company;
        cargo = c;
        if(cargo){
            cargoSpace = 10; //Ubox Containers
        }
    }
    public String toString(){
        return super.toString() + "\n This truck belongs to the company " + companyWorkFor;
    }
    public double repairCost(){
        return (super.repairCost() * super.getMileage());
    }
    public void fillCargo(int numBoxes){
        if(cargo){
            if(numBoxes > cargoSpace){
                System.out.println("The Truck doesn't have enough space");
            }

        }
    }

}
