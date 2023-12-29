package Inhertiance;


// Class A
class A1 {
    int aData = 10;

    void displayData() {
        System.out.println("Data in A1: " + aData);
    }

    void overrideMethod() {
        System.out.println("Override Method in A1");
    }
}

// Class B (Subclass of A)
class B1 extends A1 {
    int bData = 20;

    void displayData() {
        System.out.println("Data in B1: " + bData);
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in B1");
    }
}

// Class C (Subclass of B)
class C1 extends B1 {
    int cData = 30;

    void displayData() {
        System.out.println("Data in C1: " + cData);
    }

    @Override
    void overrideMethod() {
        System.out.println("Override Method in C1");
    }
}

// Main class
public class AcessingDataMembers {
    public static void main(String[] args) {
        // Create objects for each class
        A1 objA = new A1();
        B1 objB = new B1();
        C1 objC = new C1();

        // Access data members of class A1
        System.out.println("Data in A1: " + objA.aData);
        objA.displayData();
        objA.overrideMethod();

        System.out.println("---------");

        // Access data members of class B1
        System.out.println("Data in B1: " + objB.bData);
        objB.displayData();
        objB.overrideMethod(); // Call overridden method in class B1

        System.out.println("---------");

        // Access data members of class C1
        System.out.println("Data in C1: " + objC.cData);
        objC.displayData();
        objC.overrideMethod(); // Call overridden method in class C1
    }
}
