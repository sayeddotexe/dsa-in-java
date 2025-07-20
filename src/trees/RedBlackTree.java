package trees;

import java.util.TreeMap;
import java.util.TreeSet;

public class RedBlackTree {

    public static void main(String[] args){
        // Red Black Tree
        // Ensures the tree remains approximately balanced by coloring nodes red or black
        // and enforcing specific rules:
        // - Each node is either red or black.
        // - The root is always black.
        // - Red nodes cannot have red children (i.e., no two red nodes in a row).
        // - Every path from a node to its descendant null nodes contains the same number of black nodes.
        // - New nodes are inserted as red (to avoid breaking black node paths).

        //Implementation:
        // - Treeset - Unique sorted values only
        // - Treemap - Key value pairs only

        //🎯 Java's TreeMap and TreeSet are built on top of a Red-Black Tree internally,
        // but the color and balancing logic is abstracted away from you.

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map);  // Output: {1=One, 2=Two, 3=Three}

        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(20);

        System.out.println(set);  // Output: [5, 10, 20]
    }
}
