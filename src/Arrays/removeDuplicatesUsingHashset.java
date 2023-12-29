package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicatesUsingHashset {

    // Function to remove duplicate elements and return the new array
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert set to array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            newArray[index++] = num;
        }

        return newArray;
    }

    // Driver method to test removeDuplicates function
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 5, 6, 3};
        int[] result = removeDuplicates(numbers);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
