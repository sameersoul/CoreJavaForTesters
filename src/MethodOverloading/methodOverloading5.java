package MethodOverloading;

public class methodOverloading5 {

    public static int myMethod(int x) {
        System.out.println("Method with int parameter: " + x);
        return x * 2;
    }

    public static double myMethod(int x) {
        System.out.println("Method with int parameter: " + x);
        return x * 2.0;
    }

    public static void main(String[] args) {
        int result1 = myMethod(5);
        double result2 = myMethod(10);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}

