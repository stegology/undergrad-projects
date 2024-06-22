package CastingExample;

public class Dog extends Animal {
    
    //Overrides the animal class's make noise method with its own method
    @Override
    public void makeNoise() {
        System.out.println("Woof Woof!");
    }

    public void growl() {
        System.out.println("Grrrr");
    }
}
