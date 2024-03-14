public class Van extends Car{
    private String familyName;
    private boolean diesel;
    public Van(double m, String b, int a, String family, boolean diesel){
         super(m,b,a);
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
    public double repairCost(){
        if(super.inCrash()){
            if(super.getMileage() < 100){
                if(diesel) {
                    double totCost = (4 * 4 * 5000) / (super.getAge() + 10) + 1000;
                    return totCost;
                }
                else{
                    double totCost = (4 * 4 * 5000) / (super.getAge() + 10);
                    return totCost;
                }
            }
            double totCost = (4 * 4 * 5000)/(super.getAge()*super.getMileage() *.1 + 10);
            return totCost;
        }
        return 0;
    }
}
