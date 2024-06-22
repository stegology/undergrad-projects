package PolymorphismExample;

public class Polymorphism {
    
    public static void main(String[] args) {
        
        Animal myAnimal = new Animal("Dude", 6);
        

        //Polymorphism - using the same method from the dog subclass; the animal version of eat method
        myAnimal.eat();

        Dog myDog = new Dog("Max", "Brown", 5);

        // The dog class version of eat
        myDog.eat();

        System.out.println("My dog's name is " + myDog.getName() + ", he is " + myDog.getAge() + " years old, and his color is " + myDog.getColor());
        // Create a new cat object and print out the name and age using animal getters and setters
    
        Cat myCat = new Cat("Snowball", 3);
        myCat.setLitterPreference("Clumping");
        System.out.println("My cat's name is " + myCat.getName() + ", she is " + myCat.getAge() + " years old, and her litter preference is " + myCat.getLitterPreference());
    }
}
