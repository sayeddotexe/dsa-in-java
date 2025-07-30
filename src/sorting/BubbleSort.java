package sorting;

/**
 * BubbleSort.java
 *
 * 📌 Description:
 * Bubble Sort is a simple comparison-based algorithm.
 * It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
 * This continues until the list is sorted.
 *
 * ✅ When to Use:
 * - For educational purposes or very small datasets
 * - When stability is required and performance isn’t critical
 *
 * ⏱️ Time Complexity:
 * - Best: O(n) [if already sorted, with optimization]
 * - Average / Worst: O(n²)
 * 🧠 Space Complexity:
 * - O(1) in-place
 * ✅ Stable
 */

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element is greater than the next
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            // If no elements were swapped, array is sorted
            if (!swapped)
                break;
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
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}

