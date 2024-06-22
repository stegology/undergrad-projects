package PolymorphismExample;

public class Dog extends Animal {
    private String color;


    public Dog(String name, String color, int age) {
        super(name, age); // Calll the superclass constructor
        this.color = color;
    }

   public String getColor() {
        return color;
   }

   public void setColor(String color) {
        this.color = color;
   }

   public void eat() {
    System.out.println("nom nom");
   }
    

  
}
