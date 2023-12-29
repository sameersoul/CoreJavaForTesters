package Interface;
// Interface with static final variable
interface MyInterface33 {
    // Static final variable
    int MY_CONSTANT = 42;

    // Method
    void myMethod();
}

// Class implementing the interface
class MyClass33 implements MyInterface33 {
    @Override
    public void myMethod() {
        // Accessing the static final variable from the interface
        System.out.println("Constant value: " + MY_CONSTANT);
    }
}

// Main class
public class InterfaceStaticVariable {
    public static void main(String[] args) {
        // Create an instance of the class
        MyClass33 myObj = new MyClass33();

        // Call the implemented method
        myObj.myMethod();
    }
}
