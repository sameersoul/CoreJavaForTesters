package Collectionss;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Fig");
        stringSet.add("Grape");
        stringSet.add("Honeydew");
        stringSet.add("Kiwi");
        stringSet.add("Lemon");
        stringSet.add("Mango");

        // Print elements in the HashSet
        System.out.println("Elements in the HashSet: " + stringSet);

        // Add more elements to the HashSet
        stringSet.add("Orange");
        stringSet.add("Papaya");

        // Check if an element is in the HashSet
        boolean containsOrange = stringSet.contains("Orange");
        System.out.println("Does HashSet contain 'Orange': " + containsOrange);

        // Remove an element from the HashSet
        stringSet.remove("Kiwi");

        // Iterate over the elements using an Iterator
        System.out.println("Iterating over elements using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check if the HashSet is empty
        boolean isEmpty = stringSet.isEmpty();
        System.out.println("Is the HashSet empty: " + isEmpty);

        // Get the size of the HashSet
        int setSize = stringSet.size();
        System.out.println("Size of the HashSet: " + setSize);

        // Clear all elements from the HashSet
        stringSet.clear();
        System.out.println("HashSet after clearing all elements: " + stringSet);
    }
}
