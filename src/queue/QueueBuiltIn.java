package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBuiltIn {

    public static void main(String[] args){
        System.out.println("Java built in Queue");

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
    }
}
