public class IceCream {
    private String flavor;
    private int numScoops;
    private boolean inCone;
    public IceCream(String flavor, int numScoops, boolean inCone) {
        this.flavor = flavor;
        this.numScoops = numScoops;
        this.inCone = inCone;
    }
    // two IceCream objects are equal if ALL variables are the same
    public boolean equals(IceCream other) {
        if ((flavor.equals(other.getFlavor())) && (numScoops == other.getNumScoops()) && (inCone == other.isInCone())){
            return true;
        }
        return false;
    }
    // two IceCream objects are compared based on the number of scoops.
    // a cone with less scoops is considered to come "before" a cone with
    // more scoops
    public int compareTo(IceCream other) {
        return (this.numScoops - other.getNumScoops());
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void setNumScoops(int numScoops) {
        this.numScoops = numScoops;
    }

    public boolean isInCone() {
        return inCone;
    }

    public void setInCone(boolean inCone) {
        this.inCone = inCone;
    }
}
