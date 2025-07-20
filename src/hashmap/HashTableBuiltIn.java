package hashmap;

import java.util.Hashtable;

public class HashTableBuiltIn {

    public static void main(String[] args){
        // Should you use hashtable over hashmap?
        // No, you should almost never use Hashtable over HashMap in modern Java.
        // Legacy and poor performance

        // How it works
        // key-value data structure in Java that
        // Uses hashing to store and retrieve data in O(1) average time.


        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> table = new Hashtable<>();

        // Add key-value pairs
        table.put("apple", 2);
        table.put("banana", 5);
        table.put("orange", 3);

        // Get a value
        System.out.println("banana: " + table.get("banana")); // Output: 5

        // Update a value
        table.put("banana", 10);

        // Get a value
        System.out.println("banana: " + table.get("banana")); // Output: 5

        // Update a value
        table.put("banana", 10);

        // Check if a key or value exists
        System.out.println("Contains 'orange'? " + table.containsKey("orange")); // true
        System.out.println("Contains value 10? " + table.containsValue(10)); // true

        // Iterate through keys
        for (String key : table.keySet()) {
            System.out.println(key + " → " + table.get(key));
        }

        // Remove a key
        table.remove("apple");

        // Size
        System.out.println("Size: " + table.size());

        // Clear the table
        table.clear();
        System.out.println("Is empty? " + table.isEmpty());
    }
}
