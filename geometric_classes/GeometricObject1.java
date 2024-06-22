package geometric_classes;

public class GeometricObject1 {
    // Private fields for color, filled status, and creation date
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // No-arg constructor that initializes the creation date
    public GeometricObject1() {
        dateCreated = new java.util.Date();
    }

    // Constructor with parameters to initialize color and filled status
    public GeometricObject1(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

    // Setter method for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter method for filled status
    public boolean isFilled() {
        return filled;
    }
    
    // Setter method for filled status
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Getter method for creation date
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    // Setter method for creation date
    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    // Overridden toString method to return a string representation of the object
    public String toString() {
        return "Created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}
