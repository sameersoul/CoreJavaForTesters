package Arrays;
import java.util.HashSet;

public class FindDuplicates {

    public static int[] duplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicatesSet = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                // If the number is already in the set, it's a duplicate
                duplicatesSet.add(num);
            }
        }

        // Convert HashSet to array
        int[] dup = new int[duplicatesSet.size()];
        int index = 0;
        for (int num : duplicatesSet) {
            dup[index++] = num;
        }

        return dup;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4};
        int[] dup = duplicates(arr);

        // Print the duplicates
        if (dup.length > 0) {
            System.out.print("The duplicates in the array are: ");
            for (int num : dup) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("No duplicates found.");
        }
    }
}
