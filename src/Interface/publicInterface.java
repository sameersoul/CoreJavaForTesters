package Interface;
// Public interface with fields and methods
public interface PublicInterface11 {
    int field1 = 42; // Public field with a value

    void method1(); // Public method
}

// Class implementing the public interface
class MyImplementingClass1 implements PublicInterface11 {
    @Override
    public void method1() {
        System.out.println("Implemented:( Method1");
        System.out.println("Field1 value: " + field1);
    }
}

// Main class
public class publicInterface {
    public static void main(String[] args) {
        // Create an instance of the class
        MyImplementingClass1 myObj = new MyImplementingClass1();

        // Call the implemented method
        myObj.method1();
    }
}
