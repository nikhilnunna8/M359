public class IceCreamTester {
    public static void main(String[] args) {
        IceCream bob = new IceCream("Rocky Road", 3, true);
        IceCream sha = new IceCream("Mint Chip", 2, false);
        IceCream aubrey = new IceCream("Mint Chip", 2, false);
        IceCream riley = bob;
        // How many variable references have I made?
        // Answer: You have made 4 variable references

        // How many objects have I instantiated?
        // You instantiated 3 objects

        // Write in comments what you think the output would be THEN run
        // false
        // true
        // true
        // false
        // true
        // 1
        // -1
        // 0


        // the code to see if you are correct
        System.out.println(bob.equals(sha)); //correct
        System.out.println(aubrey.equals(sha)); //correct
        System.out.println(bob.equals(riley)); //correct
        System.out.println(aubrey == sha); //correct
        System.out.println(riley == bob); //correct
        System.out.println(bob.compareTo(sha)); //correct
        System.out.println(aubrey.compareTo(bob)); //correct
        System.out.println(aubrey.compareTo(sha)); //correct
    }
}
