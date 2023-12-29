package THIS_SUPER;
class MiClass {
    // Method using this()
    void methodWithThis() {
        System.out.println("Method with this(:):");
        this.anotherMethod(); // Calling another method using this()
    }

    // Another method
    void anotherMethod() {
        System.out.println("Another Method");
    }
}

class RootClass extends MiClass {
    // Method using super()
    void methodWithSuper() {
        System.out.println("Method with super()");
    }
}

class SlaveClass extends RootClass {
    // Method using this() and super()
    void methodWithThisAndSuper() {
        this.methodWithThis(); // Calling method with this()
        super.methodWithSuper(); // Calling method with super()
    }
}

public class methodWithThisAndSuper {
    public static void main(String[] args) {
        SlaveClass obj = new SlaveClass();
        obj.methodWithThisAndSuper();
    }
}
