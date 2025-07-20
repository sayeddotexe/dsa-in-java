package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetBuiltIn {

    public static void main(String[] args){

        // A HashSet is a collection of unique elements with:
        // No duplicates
        // No guaranteed order
        // Fast operations (O(1) average for add, remove, contains)

        // Use HashSet if:
        // you only need to store unique values (no keys) and check existence.

        HashSet<String> fruits = new HashSet<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple"); // duplicate, ignored

        System.out.println("Set: " + fruits); // Output: [banana, orange, apple] (order not guaranteed)

        System.out.println("Contains banana? " + fruits.contains("banana")); // true

        fruits.remove("orange");
        System.out.println("After removal: " + fruits); // [banana, apple]

        System.out.println("Size: " + fruits.size()); // 2

    }
}
