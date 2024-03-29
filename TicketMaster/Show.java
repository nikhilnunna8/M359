public class Show {
    private String date;
    private double price;
    private int quantity;
    private String performer;
    private String city;

    public Show(String date, double price, int quantity, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.performer = performer;
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Uses the information from a show class object to print out it's contents
     * in a formatted string.
     * @return String containing a formatted output
     */
    public String toString(){
        String out = "";
        int numSpaces = 0;
        out += this.date + "\t\t";
        out += "$" + this.price;


        out += "\t\t" + this.quantity;


        out += "\t\t" + this.performer;
        String space = "";
        numSpaces = 30 - performer.length();
        for (int i = 0; i < numSpaces; i++){
            space += " ";
        }

        out += space + this.city + "\n";

        return out;
    }
}
