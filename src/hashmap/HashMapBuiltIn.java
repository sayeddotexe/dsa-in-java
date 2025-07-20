package hashmap;

import java.util.HashMap;

public class HashMapBuiltIn {

    public static void main(String[] args){

        // Always use over Hash table

        // How it works:
        // data structure that stores key-value pairs, allowing
        // O(1) average-time complexity for put() and get()
        // No duplicate keys
        // Fast lookup using hashing

        // Use HashMap if:
        // If you need to map a key to a value.

        HashMap<String, Integer> map = new HashMap<>();

        // Put elements into the map
        map.put("apple", 3);
        map.put("banana", 5);
        map.put("orange", 2);

        // Update value (same key)
        map.put("apple", 6);

        System.out.println(map);

        // Get a value by key
        System.out.println("apple: " + map.get("apple")); // Output: 6

        // Check if a key exists
        System.out.println("Contains banana? " + map.containsKey("banana")); // true

        // Check if a value exists
        System.out.println("Contains value 5? " + map.containsValue(5)); // true

        // Iterate through keys and values
        System.out.println("All entries:");
        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        // Remove a key
        map.remove("orange");

        // Size of map
        System.out.println("Size of map: " + map.size());

        // Clear all entries
        map.clear();
        System.out.println("Is empty? " + map.isEmpty()); // true

    }
}
