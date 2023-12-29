package Exceptions;

public class multipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int result = 5 / 0; // This will generate Arithmetic Exception
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
