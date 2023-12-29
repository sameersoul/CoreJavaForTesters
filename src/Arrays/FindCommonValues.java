package Arrays;

import java.util.HashSet;

public class FindCommonValues {

    // Function to find common values between two arrays
    public static void findCommonValues(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> commonValues = new HashSet<>();

        // Populate set1 with elements from arr1
        for (int num : arr1) {
            set1.add(num);
        }

        // Check elements of arr2 against set1 to find common values
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonValues.add(num);
            }
        }

        System.out.println("Common values: " + commonValues);
    }

    // Driver method to test findCommonValues function
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        findCommonValues(arr1, arr2);
    }
}
