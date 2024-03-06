public class Cards {
    private double cost;
    private String recipient;
    public Cards(String recipient){
        this.recipient = recipient;
        cost = 1.0;
    }
    public Cards(String recipient, double cost){
        this.recipient = recipient;
        this.cost = cost;
    }
    public void greeting(){
        System.out.println("If you are reading this someone didn't do their job.");
    }
    public String getCostPhrase() {
        return "The card costs " + cost + " dollars.";
    }

    public String getRecipient() {
        return recipient;
    }
}
