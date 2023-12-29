package Exceptions;

public class Example3 {
    public static void main(String[] args) throws Exception {
        methodThatThrowsException();
    }

    static void methodThatThrowsException() throws Exception {
        throw new Exception("This is a checked exception.");
    }
}

