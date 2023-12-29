package Operators;
public class SmallerLargerNumber {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 10;

        if (num1 < num2) {
            System.out.println("Smaller Number: " + num1);
            System.out.println("Larger Number: " + num2);
        } else if (num1 > num2) {
            System.out.println("Smaller Number: " + num2);
            System.out.println("Larger Number: " + num1);
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
