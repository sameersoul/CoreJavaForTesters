package Constructors;
class MyClass7 {
    // Default constructor
    MyClass7() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    MyClass7(String str) {
        System.out.println("Constructor with String parameter: " + str);
    }
}

public class constructorWithReturntype {
    public static void main(String[] args) {
        // Instantiate the class to call constructors
        new MyClass7();            // Calls default constructor
        new MyClass7("World");     // Calls parameterized constructor
    }
}
