package sorting;

/**
 * HeapSort.java
 *
 * 📌 Description:
 * Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure.
 * It builds a max heap and repeatedly extracts the largest element to sort the array.
 *
 * ✅ When to Use:
 * - You want O(n log n) worst-case time
 * - You don’t need a stable sort
 * - You want an in-place sort without recursion
 *
 * ⏱️ Time Complexity:
 * - Best / Average / Worst: O(n log n)
 * 🧠 Space Complexity:
 * - O(1) in-place
 * ❌ Not stable
 */

public class HeapSort {

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract elements
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            swap(arr, 0, i);

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // Heapify a subtree rooted at index i
    public static void heapify(int[] arr, int n, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2; // right child

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, n, largest); // Recursively heapify
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        System.out.println("Before sorting:");
        printArray(arr);

        heapSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}
