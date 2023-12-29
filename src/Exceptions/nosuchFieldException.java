package Exceptions;

public class nosuchFieldException {
    public static void main(String[] args) {
        try {
            Class.forName("SomeClass").getField("nonexistentField"); // This will generate NoSuchFieldException
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
}
