package CastingExample;

public class Casting {
    public static void main(String[] args) {
        
        // Upcasting a new dog object as an animal obj (java does this automatically because dog is a subclass of animal)
        Animal myAnimal = new Dog();

        Dog myDog = new Dog();
        doAnimalStuff(myDog);

        Cat myCat = new Cat();
        doAnimalStuff(myCat);

        // This one will default to the animal method becuase giraffee doesnt override the method makenoise
        Giraffe myGiraffe = new Giraffe();
        doAnimalStuff(myGiraffe);



    }    

    // Upcasting allows us to pass any animal object to this method 
    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();

        // Instance of checks if the animal is a dog
        if (animal instanceof Dog) {
            // Downcasting allows us to pass any animal object to this method 
            Dog myDog = (Dog)animal;
            myDog.growl();
        }

        
    }
}
