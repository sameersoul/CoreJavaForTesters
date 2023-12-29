package Constructors;
class ParentClass {
    // Default constructor of the parent class
    ParentClass() {
        System.out.println("Parent Class Default Constructor");
    }

    // Parameterized constructor of the parent class
    ParentClass(int value) {
        System.out.println("Parent Class Parameterized Constructor with value: " + value);
    }
}

class ChildClass extends ParentClass {
    // Default constructor of the child class
    ChildClass() {
        super(); // Call parent class default constructor
        System.out.println("Child Class Default Constructor");
    }

    // Parameterized constructor of the child class
    ChildClass(int value) {
        super(value); // Call parent class parameterized constructor
        System.out.println("Child Class Parameterized Constructor with value: " + value);
    }
}

public class SuperAndChildClassConstructors {
    public static void main(String[] args) {
        // Instantiate the child class to call constructors
        new ChildClass();         // Calls default constructor of parent and child
        new ChildClass(42);       // Calls parameterized constructor of parent and child
    }
}
