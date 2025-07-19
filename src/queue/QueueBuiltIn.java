package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueBuiltIn {

    public static void main(String[] args){
        System.out.println("Java built in Queue");
        System.out.println("Queue using LinkedList");

        // We cannot instantiate a Queue directly as it is an interface.
        // Here, we can use a class like LinkedList or PriorityQueue that implements this interface.

        Queue<Integer> queue = new LinkedList<>();

        // Enqueue
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue); // [10, 20, 30]

        // Dequeue
        int removed = queue.remove(); // Removes 10
        System.out.println("Removed: " + removed);

        // Peek
        System.out.println("Peek: " + queue.peek()); // 20

        System.out.println("Final Queue: " + queue); // [20, 30]

        System.out.println("\nQueue using Array Dequeue");

        // ArrayDeque (also known as an “Array Double Ended Queue”, pronounced as “ArrayDeck”)
        // is a special kind of a growable array that allows us to add or remove an element from both sides.
        Queue<Integer> queue2 = new ArrayDeque<>();

        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);

        System.out.println("Queue: " + queue2); // [1, 2, 3]

        int removed2 = queue2.poll(); // Removes 1
        System.out.println("Removed: " + removed2);

        System.out.println("Peek: " + queue2.peek()); // 2

        System.out.println("Final Queue: " + queue2); // [2, 3]
    }
}
