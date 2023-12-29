package Exceptions;

public class classNotFoundException {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("NonExistentClass"); // This will generate ClassNotFoundException
    }
}

