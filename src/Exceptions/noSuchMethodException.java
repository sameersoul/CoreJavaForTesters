package Exceptions;

public class noSuchMethodException {
    public static void main(String[] args) {
        try {
            Class.forName("SomeClass").getMethod("nonexistentMethod"); // This will generate NoSuchMethodException
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

