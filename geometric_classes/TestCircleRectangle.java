package GeometricClasses;

public class TestCircleRectangle {
    public static void main(String[] args) {
        // Create a Circle4 object with radius 1
        Circle4 circle = new Circle4(1);

        // Print details about the circle
        System.out.println("A circle " + circle.toString());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        // Create a Rectangle1 object with width 2 and height 4
        Rectangle1 rectangle = new Rectangle1(2, 4);    
        // Print details about the rectangle
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
    
}
