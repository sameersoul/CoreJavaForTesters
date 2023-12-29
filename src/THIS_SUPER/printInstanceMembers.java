package THIS_SUPER;
class MyClass {
    int x = 10;

    void printField() {
        System.out.println("Field value using this: " + this.x);
        // Without using object (works inside non-static methods)
        System.out.println("Field value without using object: " + x);
    }
}

public class printInstanceMembers {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.printField();
    }
}
