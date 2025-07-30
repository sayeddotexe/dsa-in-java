package sorting;

/**
 * SelectionSort.java
 *
 * 📌 Description:
 * Selection Sort repeatedly selects the smallest (or largest) element and puts it in its correct position.
 *
 * ✅ When to Use:
 * - Simple to understand or implement
 * - Educational or when memory writes are limited
 *
 * ⏱️ Time Complexity:
 * - Best / Average / Worst: O(n²)
 * 🧠 Space Complexity:
 * - O(1) in-place
 * ❌ Not stable
 */

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // Find the index of minimum element
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Swap with the current index
            if (minIdx != i) {
                swap(arr, i, minIdx);
            }
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
        int[] arr = {29, 10, 14, 37, 13};
        System.out.println("Before sorting:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}
