package arraylist;

import java.util.ArrayList;

public class ArrayListBuiltIn {
    public static void main(String[] args){
        // ArrayList is a resizable array implementation in Java.
        // It's part of the Java Collections Framework, backed by an array internally but grows as needed.
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);              // Add to end
        list.add(1, 20);           // Add at index 1
        list.get(0);               // Get element at index
        list.set(0, 99);           // Replace element
//        list.remove(0);            // Remove by index
//        list.contains(20);         // Check if element exists
//        list.size();               // Current size
//        list.isEmpty();            // Check if empty
//        list.clear();              // Remove all elements

        for (int num : list) {
            System.out.print(num + " ");  // Iterate through
        }

    }
}
