package Exceptions;

public class ArithmeticException {
    public static void main(String[] args) {
        int result = divide(5, 0); // This will generate Arithmetic Exception
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
