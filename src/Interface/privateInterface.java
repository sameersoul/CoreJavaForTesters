package Interface;
// Protected interface with fields and methods
interface ProtectedInterface {
    int field1 = 42; // Protected field with a value

    void method1(); // Protected method
}

// Class implementing the protected interface
class MyImplementingClass2 implements ProtectedInterface {
    @Override
    public void method1() {
        System.out.println("Implemented:) Method1");
        System.out.println("Field1 value: " + field1);
    }
}

// Main class
public class privateInterface {
    public static void main(String[] args) {
        // Create an instance of the class
        MyImplementingClass2 myObj = new MyImplementingClass2();

        // Call the implemented method
        myObj.method1();
    }
}
