package GeometricClasses;

public class Circle4 extends GeometricObject1 {
    private double radius; // Radius of the circle

    // Default constructor
    public Circle4() {
    }

    // Constructor with radius parameter
    public Circle4(double radius) {
        // Call super() to invoke the no-arg constructor of the superclass
        super();
        this.radius = radius; // Initialize radius
    }

    // Constructor with radius, color, and filled parameters
    public Circle4(double radius, String color, boolean filled) {
        // Call super() to invoke the constructor of the superclass with color and filled parameters
        super(color, filled);
        this.radius = radius; // Initialize radius
    }

    // Get radius
    public double getRadius() {
        return radius;
    }

    // Set radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate and return the area of the circle
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Calculate and return the diameter of the circle
    public double getDiameter() {
        return 2 * radius;
    }

    // Calculate and return the perimeter (circumference) of the circle
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // Print details about the circle
    public void printCircle() {
        System.out.println(toString() + "The circle is created " + getDateCreated() + " and the radius is " + radius);
    }

    // Override the toString method to provide a string representation of the circle
    public String toString() {
        return "Circle WWWW " + getColor() + super.toString();
    }
}
