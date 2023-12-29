package MethodOverloading;

public class methodOverloading3 {

    public static void myMethod11(int x) {
        System.out.println("Method with one parameter: " + x);
    }

    public static void myMethod11(int y) {
        System.out.println("Method with one parameter: " + y);
    }

    public static void main(String[] args) {
        myMethod11(50);
        myMethod11(10);
    }
}
