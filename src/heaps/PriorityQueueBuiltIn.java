package heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueBuiltIn {

    public static void main(String[] args){
        // What is a heap:
        // A heap is a specialized tree-based data structure that satisfies the heap property:
        // Max Heap: Every parent node is greater than or equal to its children.
        // Min Heap: Every parent node is less than or equal to its children.

        // Use cases:
        //  Efficiently get the smallest or largest element in O(1) time (peek).
        // HeapSort
        // PriorityQueue

        // Types:
        // Max Heap: Every parent node is greater than or equal to its children.
        //       SIMPLER TERMS:  the largest element is at the root.  - Used for Heapsort
        // Min Heap: Every parent node is less than or equal to its children.
        //       SIMPLER TERMS:  the smallest element is at the root.  - Used for PriorityQueue


        // Priority Queue use case:
        // Dijkstra’s shortest path algorithm uses a priority queue to pick the next vertex with the smallest tentative distance. (min heap)
        // Prim’s Minimum Spanning Tree algorithm uses it to select the edge with the lowest weight. (min heap)

        // Max Heap using custom Comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(5);
        maxHeap.add(1);
        maxHeap.add(10);
        System.out.println(maxHeap);
        System.out.println("Max Heap poll: " + maxHeap.poll()); // 10

        // Min Heap (default)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(5);
        minHeap.add(1);
        minHeap.add(10);
        System.out.println(minHeap);
        System.out.println("Min Heap poll: " + minHeap.poll()); // 1

    }
}
