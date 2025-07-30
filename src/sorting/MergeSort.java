package sorting;

/**
 * MergeSort.java
 *
 * 📌 Description:
 * Merge Sort is a stable, divide-and-conquer sorting algorithm.
 * It works by recursively dividing the array into halves,
 * sorting each half, and then merging them back together in order.
 *
 * ✅ When to Use:
 * - You want guaranteed O(n log n) performance
 * - You need a **stable sort** (preserves relative order of duplicates)
 * - You are sorting linked lists or large datasets
 *
 * ⏱️ Time Complexity:
 * - Best / Average / Worst: O(n log n)
 *
 * 🧠 Space Complexity:
 * - O(n) for temporary arrays used during merge
 *
 * ✅ Stable
 * ❌ Not in-place (uses extra space)
 */

public class MergeSort {

    // Recursive merge sort function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = left + (right - left) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted subarrays into one sorted array
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to merge
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge the temp arrays

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining elements of L[], if any
        while (i < n1) {
            arr[k++] = L[i++];
        }

        // Copy remaining elements of R[], if any
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 7, 3, 1, 6, 2, 8, 5 };
        System.out.println("Before sorting:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1); // Perform merge sort

        System.out.println("After sorting:");
        printArray(arr);
    }
}
