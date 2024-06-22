package dynamic_binding_example1;

public class DynamicBindingDemo {

    public static void main(String[] args) {

        Object o = new GraduateStudent(); // GraduateStudent Object
        Object o1 = new Object(); // Plain Object

        
        if (o1 instanceof GraduateStudent) {
            System.out.println("Never got here");
            GraduateStudent gs = (GraduateStudent) o1;
        }

        // Call the m method with different objects
        m(o); // Should print "Student" because GraduateStudent extends Student
        m(new Student()); // Should print "Student"
        m(new Person()); // Should print "Person"
        m(new Object()); // Should print default object 

    }
    
    public static void m(Object x) {
        System.out.println(x.toString()); // Print the toString() of the object
    }
}

class GraduateStudent extends Student {
   // inherits toString() from Student
}

class Student extends Person {
    public String toString() {
        return "Student";
    }
}

class Person {
    public String toString() {
        return "Person";
    }
}
