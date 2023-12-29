package AccessModifiers;
// Class with private fields and method
class PrivateClass {
    private int privateField = 10;

    private void privateMethod() {
        System.out.println("Private Method");
    }

    public void displayPrivateField() {
        System.out.println("Private Field: " + privateField);
    }

    public void callPrivateMethod() {
        privateMethod();
    }

    public static void main(String[] args) {
        PrivateClass privateObj = new PrivateClass();
        privateObj.displayPrivateField();
        privateObj.callPrivateMethod();
    }
}

// Subclass trying to access private members (will result in compilation error)
class SubClass extends PrivateClass {
    // Trying to access private members in the subclass
    // This will result in a compilation error
    /*
    void accessPrivateMembers() {
        System.out.println(privateField);  // Compilation error
        privateMethod();  // Compilation error
    }
    */
}
