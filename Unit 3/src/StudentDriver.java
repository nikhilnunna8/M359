public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student("Nikhil", "Nunna");
        Student s2 = new Student("Mokshi", "Nunna");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.equals(s2));
    }
}
