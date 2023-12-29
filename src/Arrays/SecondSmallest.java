package Arrays;

public class SecondSmallest {

    // Function to find the second smallest number in an array
    public static int FindSecondSmallest(int[] arr) {
        int firstMin = arr[0];
        int secondMin = arr[0];

        // Traverse the array to find the two smallest numbers
        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin && num != firstMin) {
                secondMin = num;
            }
        }

        return secondMin;
    }

    // Driver method to test findSecondSmallest function
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int secondSmallest = FindSecondSmallest(numbers);
        System.out.println("Second Smallest Number: " + secondSmallest);
    }
}
