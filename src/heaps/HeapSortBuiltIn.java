package heaps;

import java.util.PriorityQueue;

public class HeapSortBuiltIn {
    public static void heapSort(int[] arr){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 1: Add all elements to the min heap
        // .offer Adds an element to the queue. Returns true if successfully added.
        for (int num : arr) {
            minHeap.offer(num);
        }

        // Step 2: Extract elements from the min heap to get sorted order
        // .poll - Removes and returns the head (the smallest element for a min-heap) of the queue.
        int i = 0;
        while (!minHeap.isEmpty()) {
            arr[i++] = minHeap.poll();
        }
    }

    public static void main(String[] args){
        int[] arr = {5, 3, 8, 4, 1, 9, 7};

        System.out.println("Before sorting:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        heapSort(arr);

        System.out.println("After sorting:");
        for (int num : arr) System.out.print(num + " ");
    }
}
