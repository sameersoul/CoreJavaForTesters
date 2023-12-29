package Interface;
// Parent interface
interface ParentInterface {
    void method1();
}

// Child interface inheriting from the parent interface
interface ChildInterface extends ParentInterface {
    void method2();
}

// Class implementing the child interface
class MyImplementingClass implements ChildInterface {
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
public class InterfaceInheritance {
    public static void main(String[] args) {
        // Create an instance of the class
        MyImplementingClass myObj = new MyImplementingClass();

        // Call the implemented methods
        myObj.method1();
        myObj.method2();
    }
}
