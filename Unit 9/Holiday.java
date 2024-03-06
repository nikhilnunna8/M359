public class Holiday extends Cards {
    public Holiday(String name, double cost){
        super(name, cost);
    }
    public String toString(){
        return "Dear " + super.getRecipient() + ", Happy Holidays.";
    }
}
