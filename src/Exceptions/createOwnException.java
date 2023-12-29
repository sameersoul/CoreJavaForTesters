package Exceptions;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class createOwnException {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}

