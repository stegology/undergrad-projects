package casting_example;

public class Cat extends Animal {
    
    //Overrides the animal class's make noise method with its own method
    @Override
    public void makeNoise() {
        System.out.println("Meow Meow!");
    }

    public void growl() {
        System.out.println("Prrrrr");
    }
}
