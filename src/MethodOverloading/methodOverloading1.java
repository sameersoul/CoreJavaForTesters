package MethodOverloading;
public class methodOverloading1 {

    public static void myMethod(int x) {
        System.out.println("Method with one parameter: " + x);
    }

    public static void myMethod(int x, int y) {
        System.out.println("Method with two parameters: " + x + ", " + y);
    }

    public static void main(String[] args) {
        myMethod(5);
        myMethod(10, 20);
    }
}

