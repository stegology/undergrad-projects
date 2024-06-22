package wrapper_example;

public class WrapperExample {
    public static void main(String[] args) {
        
        // From primitive data type value
        Double d1 = Double.valueOf(5.0);
        System.out.println("d1: " + d1);

        // From string representing the numeric value
        Double d2 = Double.valueOf("5.0");
        System.out.println("d2: " + d2);

        // Utilizing autoboxing
        Double d3 = 5.0;
        System.out.println("d3: " + d3);

        System.out.println(d1 == d2);
        System.out.println(d1.compareTo(d2));
    }   
}
