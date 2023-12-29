package Abstract;
// Abstract class with abstract and non-abstract methods
abstract class AbstractClass {
    // Abstract method (to be implemented by subclasses)
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("Non-Abstract Method");
    }
}

// Subclass for the abstract class
class SubClass extends AbstractClass {
    // Implementation of the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Implemented Abstract Method");
    }
}

// Main class
public class AbstractMethod {
    public static void main(String[] args) {
        // Create an object in the child class for the abstract class
        SubClass subObj = new SubClass();

        // Access the non-abstract method
        subObj.nonAbstractMethod();
    }
}
