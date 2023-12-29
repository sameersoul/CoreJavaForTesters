package Constructors;
class MyClass {
    // Default constructor
    MyClass() {
        System.out.println("Default Constructor");
    }

    // One argument constructor
    MyClass(int value) {
        System.out.println("One Argument Constructor with value: " + value);
    }

    // Two argument constructor
    MyClass(String str, int number) {
        System.out.println("Two Argument Constructor with str: " + str + " and number: " + number);
    }
}

public class DifferentConstructors {
    public static void main(String[] args) {
        // Instantiate the class to call all constructors
        new MyClass();                   // Default constructor
        new MyClass(42);                 // One argument constructor
        new MyClass("Hello", 123);       // Two argument constructor
    }
}
