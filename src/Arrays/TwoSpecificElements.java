package Arrays;

public class TwoSpecificElements {

    // Function to verify if the array contains two specified elements
    public static boolean containsTwoElements(int[] arr, int element1, int element2) {
        boolean containsElement1 = false;
        boolean containsElement2 = false;

        // Traverse the array to check for the specified elements
        for (int num : arr) {
            if (num == element1) {
                containsElement1 = true;
            } else if (num == element2) {
                containsElement2 = true;
            }
        }

        // Return true if both elements are found, otherwise false
        return containsElement1 && containsElement2;
    }

    // Driver method to test containsTwoElements function
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 12, 4, 5, 23, 6};
        boolean result = containsTwoElements(numbers, 12, 23);
        System.out.println("Array contains both elements: " + result);
    }
}
