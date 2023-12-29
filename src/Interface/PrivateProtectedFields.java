
package Interface;// Interface with private, public, and protected fields
interface MyInterface21 {
    private int privateField = 10; // Private field
    int publicField = 20; // Public field
    protected int protectedField = 30; // Protected field

    void myMethod(); // Method
}

// Class implementing the interface
class MyImplementingClass11 implements MyInterface {
    @Override
    public void myMethod() {
        // Accessing fields from the interface
        System.out.println("Public Field: " + publicField);
        System.out.println("Protected Field: " + protectedField);

        // Private field cannot be accessed directly in the implementing class
        // System.out.println("Private
