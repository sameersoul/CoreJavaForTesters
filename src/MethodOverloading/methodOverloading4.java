package MethodOverloading;

public class methodOverloading4 {

    public static void myMethod(int x) {
        System.out.println("Method with int parameter: " + x);
    }

    public static void myMethod(String str) {
        System.out.println("Method with String parameter: " + str);
    }

    public static void main(String[] args) {
        myMethod(5);
        myMethod("Hello");
    }
}
