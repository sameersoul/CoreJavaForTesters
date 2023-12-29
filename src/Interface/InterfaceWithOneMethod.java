package Interface;
// Interface with one method
interface MyInterface {
    void myMethod();
}

// Class implementing the interface
class MyClass implements MyInterface {
    @Override
    public void myMethod() {
        System.out.println("Implemented MyMethod");
    }
}

// Main class
public class InterfaceWithOneMethod {
    public static void main(String[] args) {
        // Create an instance of the class
        MyClass myObj = new MyClass();

        // Call the implemented method
        myObj.myMethod();
    }
}
