package Static;

public class MyClass {
    // Static variables
    static int staticVar1;
    static String staticVar2;

    // Instance variables
    int instanceVar1;
    String instanceVar2;

    // Static methods
    //Printing instance variables inside static methods
    static void staticMethod1() {
        MyClass obj = new MyClass();
        System.out.println("Printing instanceVar1 in staticMethod1: " + obj.instanceVar1);
        System.out.println("Printing instanceVar2 in staticMethod1: " + obj.instanceVar2);
    }

    static void staticMethod2() {
        MyClass obj = new MyClass();
        System.out.println("Calling instanceMethod1 in staticMethod2");
        obj.instanceMethod1();
    }

    // Instance methods
    // Printing static variables in instance method
    void instanceMethod1() {
        System.out.println("Printing staticVar1 in instanceMethod1: " + staticVar1);
        System.out.println("Printing staticVar2 in instanceMethod1: " + staticVar2);
    }
      //calling static method in instance method
    void instanceMethod2() {
        System.out.println("Calling staticMethod1 in instanceMethod2");
        staticMethod1();
    }

    // Main method
    public static void main(String[] args) {
        // Instantiate the object
        MyClass obj = new MyClass();

        // Initializing static variables
        staticVar1 = 10;
        staticVar2 = "Hello";

        // Initializing instance variables
        obj.instanceVar1 = 20;
        obj.instanceVar2 = "World";

        // Print static and instance variables in main method
        System.out.println("Printing staticVar1 in main method: " + staticVar1);
        System.out.println("Printing staticVar2 in main method: " + staticVar2);
        System.out.println("Printing instanceVar1 in main method: " + obj.instanceVar1);
        System.out.println("Printing instanceVar2 in main method: " + obj.instanceVar2);

        // Call static and instance methods in main method
        System.out.println("\nCalling staticMethod1 in main method");
        staticMethod1();

        System.out.println("\nCalling instanceMethod1 in main method");
        obj.instanceMethod1();

        System.out.println("\nCalling staticMethod2 in main method");
        staticMethod2();

        System.out.println("\nCalling instanceMethod2 in main method");
        obj.instanceMethod2();
    }
}
