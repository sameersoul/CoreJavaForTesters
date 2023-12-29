package Interface;
// First interface with one method
interface Interface11 {
    void myMethod();
}

// Second interface with the same method signature
interface Interface22 {
    void myMethod();
}

// Class implementing both interfaces
class MyImplementingClass11 implements Interface11, Interface22 {
    @Override
    public void myMethod() {
        System.out.println("Implemented MyMethod");
    }
}

// Main class
public class InterfacesWithSameMethodSignature {
    public static void main(String[] args) {
        // Create an instance of the class
        MyImplementingClass11 myObj = new MyImplementingClass11();

        // Call the implemented method
        myObj.myMethod();
    }
}
