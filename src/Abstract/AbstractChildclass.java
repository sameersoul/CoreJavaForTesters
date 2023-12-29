package Abstract;
// Abstract class with abstract and non-abstract methods
abstract class AbstractClass1 {
    // Abstract method (to be implemented by subclasses)
    abstract void abstractMethod();

    // Non-abstract method
    void nonAbstractMethod() {
        System.out.println("Non-Abstract Method");
    }
}

// Subclass for the abstract class
class SubClass1 extends AbstractClass1 {
    // Implementation of the abstract method
    @Override
    void abstractMethod() {
        System.out.println("Implemented Abstract Method");
    }

    // Method to create an instance for the child class and call abstract method
    void callAbstractMethodInChild() {
        // Create an instance for the child class
        SubClass1 subObj = new SubClass1();
        // Call abstract method
        subObj.abstractMethod();
    }
}

// Main class
public class AbstractChildclass {
    public static void main(String[] args) {
        SubClass1 subObj = new SubClass1();
        subObj.callAbstractMethodInChild();
    }
}
