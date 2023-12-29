package Constructors;

class MyClass11 {
    // Parameterized constructor
    MyClass11(int value) {
        System.out.println("Constructor called with value: " + value);
    }
}

public class callConstructorMultipleTimes {
    public static void main(String[] args) {
        MyClass11 obj = new MyClass11(42);
        obj = new MyClass11(123); // Constructor called again with a different value
    }
}
