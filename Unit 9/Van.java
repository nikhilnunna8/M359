public class Van extends Car{
    private String familyName;
    private boolean diesel;
    public Van(double m, String b, double p, String family, boolean diesel){
         super(m,b,p);
         this.diesel = diesel;
         familyName = family;
    }
    public String toString(){
        String out = "";
        out += "This Van is from " + super.getBrand() + " and has been driven for + " + super.getMileage() + " miles.";
        if(diesel){
            out += "\nThis Van runs on a diesel engine";
        }
        else{
            out += "\nThis Van runs on a gas engine";
        }
        return out;
    }

    /**
     * If the van uses diesel, its repair cost is higher and calls the car class repairCost() to see if it's in a crash
     * and to calculate its repair price. If the van doesn't use diesel, it uses the car class's repairCost() with no
     * changes.
     * @return a double containing the repair price of the van object
     */
    public double repairCost(){
        if(diesel){
            return super.repairCost() + 3000;
        }
        return super.repairCost();


    }
}
