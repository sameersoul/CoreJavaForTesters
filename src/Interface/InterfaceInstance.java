package Interface;
// Interface with two methods
interface MyInterface3 {
    void method1();
    void method2();
}

// Class implementing the interface
class MyClass3 implements MyInterface3 {
    @Override
    public void method1() {
        System.out.println("Implemented Method1");
    }

    @Override
    public void method2() {
        System.out.println("Implemented Method2");
    }
}

// Main class
public class InterfaceInstance {
    public static void main(String[] args) {
        // Create an instance of the class through the interface
        MyInterface3 myObj = new MyClass3();

        // Call the implemented method
        myObj.method1();
    }
}
