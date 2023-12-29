package Interface;
// Interface with a default method
interface MyInterface12 {
    default void defaultMethod() {
        System.out.println("Default Method");
    }

    void myMethod();
}

// Class implementing the interface
class MyClass12 implements MyInterface12 {
    @Override
    public void myMethod() {
        System.out.println("Implemented MyMethod");
    }
}

// Main class
public class DefaultMethod {
    public static void main(String[] args) {
        // Create an instance of the class
        MyClass12 myObj = new MyClass12();

        // Call the implemented method
        myObj.myMethod();

        // Call the default method
        myObj.defaultMethod();
    }
}
