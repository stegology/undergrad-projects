package GeometricClasses;

// Rectangle1 is a subclass of GeometricObject1
public class Rectangle1 extends GeometricObject1 {
    private double width;  // Width of the rectangle
    private double height; // Height of the rectangle

    // Default constructor
    public Rectangle1() {
        // No initialization
    }

    // Constructor with width and height parameters
    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Constructor with width, height, color, and filled status parameters
    public Rectangle1(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);  // Set the color of the rectangle
        setFilled(filled); // Set the filled status of the rectangle
    }

    // Get height
    public double getHeight() {
        return height;
    }

    // Set height
    public void setHieight(double height){
        this.height = height;
    }

    // Get width
    public double getWidth() {
        return width;
    }

    // Set width
    public void setWidth(double width){
        this.width = width;
    }

    // Get area of the rectangle
    public double getArea() {
        return width * height;
    }

    // Get perimeter of the rectangle
    public double getPerimeter() {
        return 2 * (width + height);
    }

}
