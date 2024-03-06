public class Valentines extends Holiday{
    private int num_kisses;
    public Valentines(String name, int num_kisses){
        super(name, 2.50);
        this.num_kisses = num_kisses;
    }
    public String toString(){
        String out = "";
        out += "Dear " + super.getRecipient() + ", Love and Kisses, ";
        for (int i = 0; i < num_kisses; i++) {
            out+="xo";
        }
        return out;
    }
}
