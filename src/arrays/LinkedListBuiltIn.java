package arrays;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListBuiltIn {
    public static void main(String[] args){
        System.out.println("Java Built-in Linked List (and doubly)");

        // Use generics for type safety
        LinkedList<Integer> javaLinkedList = new LinkedList<>();

        javaLinkedList.add(2);
        javaLinkedList.add(4);
        javaLinkedList.add(6);
        javaLinkedList.add(8);

        System.out.println(javaLinkedList);  // Output: [2, 4, 6, 8]

        //ListIterator is an interface in Java that allows you to traverse a list in both directions —
        // forward and backward — and also modify the list while iterating.

        System.out.println("\nBackward traversal:");
        ListIterator<Integer> itr = javaLinkedList.listIterator(javaLinkedList.size());
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
    }
}
