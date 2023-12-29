package THIS_SUPER;
class ParentClass11 {
    // Parent class constructor
    ParentClass11() {
        System.out.println("Parent Class Constructor");
    }
}

class ChildClass11 extends ParentClass {
    // Child class constructor
    ChildClass11() {
        super(); // Calling parent class constructor using super()
        System.out.println("Child Class Constructor");
    }
}

public class callParentClassConstructor {
    public static void main(String[] args) {
        ChildClass11 obj = new ChildClass11();
    }
}
