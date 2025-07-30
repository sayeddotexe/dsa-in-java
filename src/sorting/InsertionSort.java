package sorting;

/**
 * InsertionSort.java
 *
 * 📌 Description:
 * Insertion Sort builds the sorted array one element at a time.
 * It works like how you sort playing cards by inserting each into the right spot.
 *
 * ✅ When to Use:
 * - Small datasets
 * - Partially sorted data
 * - Stable sorting is needed
 *
 * ⏱️ Time Complexity:
 * - Best: O(n) [already sorted]
 * - Average / Worst: O(n²)
 * 🧠 Space Complexity:
 * - O(1) in-place
 * ✅ Stable
 */

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // element to be inserted
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key in correct position
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("Before sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}
