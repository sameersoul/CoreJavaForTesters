package Interface;
// Interface with two methods
interface MyInterface1 {
    void method1();
    void method2();
}

// Class implementing only one method of the interface
 class MyClass1 implements MyInterface1 {
    @Override
    public void method1() {
        System.out.println("Implemented Method1");
    }

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}

// Main class
public class InterfaceWithTwoMethods {
    public static void main(String[] args) {
        // Create an instance of the class
        MyClass1 myObj = new MyClass1();

        // Call the implemented method
        myObj.method1();
    }
}
