package deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeBuiltIn {

    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to both ends
        deque.addFirst(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.addFirst(5);

        System.out.println("Deque: " + deque);  // [5, 10, 20, 30]

        // Remove from both ends
        int removedFront = deque.removeFirst(); // 5
        int removedRear = deque.removeLast();   // 30

        System.out.println("Removed Front: " + removedFront);
        System.out.println("Removed Rear: " + removedRear);

        System.out.println("Final Deque: " + deque); // [10, 20]

        // Peek at ends
        System.out.println("Front: " + deque.peekFirst()); // 10
        System.out.println("Rear: " + deque.peekLast());   // 20
    }
}
