package Exceptions;

public class numberformatException {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc"); // This will generate NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
       
    }
}

