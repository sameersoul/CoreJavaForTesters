package THIS_SUPER;
class MyClass11 {
    // Parameterized constructor
    MyClass11(int value) {
        System.out.println("Parameterized Constructor with value: " + value);
    }

    // Overloaded constructor with additional parameter
    MyClass11(int value1, int value2) {
        this(value1); // Calling parameterized constructor using this()
        System.out.println("Overloaded Constructor with values: " + value1 + ", " + value2);
    }
}

public class callArgumentConstructor {
    public static void main(String[] args) {
        MyClass11 obj = new MyClass11(10, 20);
    }
}
