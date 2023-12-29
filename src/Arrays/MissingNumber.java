package Arrays;

public class MissingNumber {

    // Function to find the missing number in a sorted array of 1 to N
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // One element is missing, so increment the size

        // Calculate the expected sum using the formula n * (n + 1) / 2
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of the array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between the expected and actual sums
        return expectedSum - actualSum;
    }

    // Driver method to test findMissingNumber function
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int missingNumber = findMissingNumber(sortedArray);
        System.out.println("Missing Number: " + missingNumber);
    }
}
