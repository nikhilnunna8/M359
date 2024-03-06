public class MenuTester {
    public static void main(String[] args) {
        MenuItem m = new MenuItem("Basic pizza");
        System.out.println();
        MenuItem e = new Entree("Rib platter", 3);
        System.out.println();
        MenuItem d = new Drink("Pepsi Zero", 24);
        System.out.println();
        MenuItem d2 = new Drink("Milkshake", 16, true);
    }
}
