package THIS_SUPER;
class OurClass {
    // Default constructor
    OurClass() {
        System.out.println("Default Constructor");
    }

    // Parameterized constructor
    OurClass(int value) {
        this(); // Calling default constructor using this()
        System.out.println("Parameterized Constructor with value: " + value);
    }
}

public class callConstructor_THIS {
    public static void main(String[] args) {
        OurClass obj = new OurClass(42);
    }
}
