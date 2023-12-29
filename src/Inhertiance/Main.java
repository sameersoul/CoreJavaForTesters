package Inhertiance;


// Class A
class A {
    void methodA1() {
        System.out.println("Method A1");
    }

    void methodA2() {
        System.out.println("Method A2");
    }

    void overrideMethod() {
        System.out.println("Override Method in A");
    }
}

// Class B (Subclass of A)
class B extends A {
    void methodB1() {
        System.out.println("Method B1");
    }

    void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in B");
    }
}

// Class C (Subclass of B)
class C extends B {
    void methodC1() {
        System.out.println("Method C1");
    }

    void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in C");
    }

}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects for each class
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // Call methods of class A
        objA.methodA1();
        objA.methodA2();
        objA.overrideMethod();

        System.out.println("---------");

        // Call methods of class B
        objB.methodA1(); // Accessing method of class A
        objB.methodB1();
        objB.methodB2();
        objB.overrideMethod(); // Call overridden method in class B

        System.out.println("---------");

        // Call methods of class C
        objC.methodA1(); // Accessing method of class A
        objC.methodB1(); // Accessing method of class B
        objC.methodC1();
        objC.methodC2();
        objC.overrideMethod(); // Call overridden method in class C
    }
}
