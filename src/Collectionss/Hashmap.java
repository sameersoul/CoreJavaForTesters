package Collectionss;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        // 2. HashMap Operations
        // Create a HashMap with at least 10 key-value pairs
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Alice");
        studentMap.put(2, "Bob");
        studentMap.put(3, "Charlie");
        studentMap.put(4, "David");
        studentMap.put(5, "Eva");
        studentMap.put(6, "Frank");
        studentMap.put(7, "Grace");
        studentMap.put(8, "Hank");
        studentMap.put(9, "Ivy");
        studentMap.put(10, "Jack");

        // Insert a Key-Value mapping into the map
        studentMap.put(11, "Katie");

        // Fetch the value of a Key
        String studentName = studentMap.get(3);
        System.out.println("Value for Key 3: " + studentName);

        // Create a clone/copy of HashMap
        Map<Integer, String> studentMapCopy = new HashMap<>(studentMap);

        // Check if a given Key is in the Map
        boolean keyExists = studentMap.containsKey(5);
        System.out.println("Key 5 exists in the Map: " + keyExists);

        // Check if a given value is in the Map
        boolean valueExists = studentMap.containsValue("Frank");
        System.out.println("Value 'Frank' exists in the Map: " + valueExists);

        // Check if the map is empty
        boolean isEmpty = studentMap.isEmpty();
        System.out.println("Is the Map empty: " + isEmpty);

        // Print the size of the Map to the console
        System.out.println("Size of the Map: " + studentMap.size());

        // Print all the Keys of the map to the console
        System.out.println("Keys in the Map: " + studentMap.keySet());

        // Print all the Values of the map to the console
        System.out.println("Values in the Map: " + studentMap.values());

        // Remove a specific Key-Value pair
        studentMap.remove(7);

        // Copy all the elements of the Map to another Map
        Map<Integer, String> anotherStudentMap = new HashMap<>(studentMap);

        
    }
}

