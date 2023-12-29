package Exceptions;

public class nullPointerException {
    public static void main(String[] args) {
        String str = null;
        int length = str.length(); // This will generate NullPointerException
    }
}
