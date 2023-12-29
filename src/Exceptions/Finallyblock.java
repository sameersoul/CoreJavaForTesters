package Exceptions;

public class Finallyblock {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }
    }
}

