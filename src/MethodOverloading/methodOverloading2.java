package MethodOverloading;

public class methodOverloading2 {

    public static void myMethod(int x) {
        System.out.println("Method with int parameter: " + x);
    }

    public static void myMethod(String str, int num) {
        System.out.println("Method with String and int parameters: " + str + ", " + num);
    }

    public static void main(String[] args) {
        myMethod(5);
        myMethod("Hello", 10);
    }
}
