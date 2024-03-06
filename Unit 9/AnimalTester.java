/**
* Lesson 7-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold?
        // It's an array of type Animal holding 6 Animal type objects

       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?
       // Yes and it's allowed because the parent class of the Cow and Pig classes is Animal, making the objects
       // animal objects of type Pig or Cow
   
       for (Animal a: barn)
            a.speak();
            // 3. What method is getting called here?  The speak method of the Animal class?
            // Speak method of each class and the Pig and cow classes have a speak method that overrides the animal class
            // speak method
       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.
       //  I observed that different methods could be called in a array even though they all share the same name due to the
       //  methods overriding. Also, the subclasses of a parent class are still considered as objects of the parent class
   }
   
}
