package Interface;
// First interface with one method
interface Interface1 {
    void method1();
}

// Second interface with one method
interface Interface2 {
    void method2();
}

// Class implementing both interfaces
class MyImplementingClass implements Interface1, Interface2 {
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
public class ImplementingTwointerfaces {
    public static void main(String[] args) {
        // Create an instance of the class
        MyImplementingClass myObj = new MyImplementingClass();

        // Call the implemented methods
        myObj.method1();
        myObj.method2();
    }
}
