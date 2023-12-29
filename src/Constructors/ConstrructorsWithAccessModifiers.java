package Constructors;
class MyClass1 {
    // Private constructor
    private MyClass1() {
        System.out.println("Private Constructor");
    }

    // Public constructor
    public MyClass1(int value) {
        System.out.println("Public Constructor with value: " + value);
    }

    // Protected constructor
    protected MyClass1(String str) {
        System.out.println("Protected Constructor with str: " + str);
    }

    // Default constructor
    MyClass1(double number) {
        System.out.println("Default Constructor with number: " + number);
    }
}

public class ConstrructorsWithAccessModifiers {
    public static void main(String[] args) {
        // Instantiate the class to call constructors with different access modifiers
        // Note: Private constructor won't be accessible here.
        new MyClass1(42);          // Public constructor
        new MyClass1("Hello");      // Protected constructor
        new MyClass1(3.14);         // Default constructor
    }
}
