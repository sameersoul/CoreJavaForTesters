package Abstract;
// Abstract class with abstract and non-abstract methods
abstract class AbstractClass2 {
    // Abstract method (to be implemented by subclasses)
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("Non-Abstract Method");
    }
}

// Subclass for the abstract class
class SubClass2 extends AbstractClass2 {
    // Implementation of the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Implemented Abstract Method");
    }

    // Method to create an instance for the child class and call non-abstract method
    void callNonAbstractMethodInChild() {
        // Create an instance for the child class
        SubClass2 subObj = new SubClass2();
        // Call non-abstract method
        subObj.nonAbstractMethod();
    }
}

// Main class
public class callNonAbstractMethod {
    public static void main(String[] args) {
        SubClass2 subObj = new SubClass2();
        subObj.callNonAbstractMethodInChild();
    }
}
