package sorting;

/**
 * QuickSort.java
 *
 * 📌 Description:
 * Quick Sort is a highly efficient, in-place, divide-and-conquer sorting algorithm.
 * It works by selecting a 'pivot' element and partitioning the array so that:
 * - All elements less than the pivot come before it
 * - All elements greater than the pivot come after it
 * Then, it recursively sorts the subarrays.
 *
 * ✅ When to Use:
 * - When you want fast average-case sorting (O(n log n))
 * - When you don't need stability (relative order of duplicates doesn't matter)
 * - When in-place sorting is important (low memory usage)
 * - Common in coding interviews to test recursion, partitioning, and algorithm design
 *
 * ⏱️ Time Complexity:
 * - Best / Average: O(n log n)
 * - Worst (rare, e.g. already sorted): O(n²)
 *
 * 🧠 Space Complexity:
 * - O(log n) due to recursion stack (in-place)
 *
 * 🔍 Not Stable
 */

public class QuickSort {
    // Quick Sort function (recursive)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left and right parts
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function: places pivot in correct position and returns its index
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose last element as pivot
        int i = low - 1;        // i is the index of the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                swap(arr, i, j);
            }
        }

        // Finally, place pivot in the correct position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // Helper function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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

        quickSort(arr, 0, arr.length - 1); // Perform quick sort

        System.out.println("After sorting:");
        printArray(arr);
    }
}
