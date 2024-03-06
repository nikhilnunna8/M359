public class Birthday extends Cards{
    private int age;
    public Birthday(String name, int age){
        super(name, 2.0);
        this.age = age;
    }
    public String toString(){
        return "Happy Birthday " + super.getRecipient() + " you are turning " + age + " years old!";
    }
}
