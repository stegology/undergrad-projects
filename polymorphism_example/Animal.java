package polymorphism_example;

public class Animal {
    private String name;
    private int age;

    // No args contructor
    public Animal() {  
    }

    // Parameter Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method that 
    public void eat() {
        System.out.println("munch");
    }

    // Get name
    public String getName() {
        return name;
    }
    // Set Name
    public void setName(String name) {
        this.name = name;
    }

    // Get age
    public int getAge() {
        return age;
    }
    // Set age
    public void setAge(int age) {
        this.age = age;
    }
}
