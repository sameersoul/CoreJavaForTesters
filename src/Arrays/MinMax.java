package Arrays;

import java.util.Arrays;

public class MinMax {

    // Function to find the minimum and maximum value of an array
    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }

    // Driver method to test findMinMax function
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        findMinMax(numbers);
    }
}
