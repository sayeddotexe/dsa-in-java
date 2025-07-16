package arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void demo() {
        // 1. Declaration & Initialization
        int[] arr1 = new int[5];                    // Declared, size 5, default values = 0
        int[] arr2 = {10, 20, 30, 40, 50};          // Direct initialization
        String[] names = new String[3];             // Object array, default values = null

        System.out.println("arr1 default values: " + Arrays.toString(arr1));
        System.out.println("arr2 initialized: " + Arrays.toString(arr2));
        System.out.println("names default values: " + Arrays.toString(names));

        // 2. Access & Modification
        System.out.println("First element of arr2: " + arr2[0]); // 10
        arr2[2] = 35; // Update 3rd element
        System.out.println("Modified arr2: " + Arrays.toString(arr2));

        // 3. Traversal
        System.out.print("Using for loop: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        System.out.print("Using for-each loop: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();


        // 4. Common Operations
        int sum = 0;
        int max = arr2[0];
        int min = arr2[0];
        for (int num : arr2){
            sum += num;
            if (num > max){
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        // Finding max/min element
        System.out.println("Max:" + max +" Min: "+ min);
        // sum and average of elements
        System.out.println("Sum:" + sum);
        System.out.println("Average:" + sum/arr2.length);

        // search for an element (lienar search)
        int target = 35;
        boolean found = false;
        for (int i = 0; i < arr2.length;i++){
            if (target == arr2[i]){
                System.out.println("found element index: "+i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("Element not found");
        }
        // 6. Copying Arrays
        int[] arrCopy1 = new int[arr2.length];
        System.arraycopy(arr2, 0, arrCopy1, 0, arr2.length);
        System.out.println("Copied using System.arraycopy: " + Arrays.toString(arrCopy1));

        int[] arrCopy2 = Arrays.copyOf(arr2, arr2.length);
        System.out.println("Copied using Arrays.copyOf: " + Arrays.toString(arrCopy2));

        // 7. Arrays Utility Methods
        Arrays.sort(arr2);
        System.out.println("Sorted array: " + Arrays.toString(arr2));
        int index = Arrays.binarySearch(arr2, 35);
        System.out.println("Binary search for 35 found at index: " + index);
        Arrays.fill(arr1, 7);
        System.out.println("Filled arr1 with 7s: " + Arrays.toString(arr1));

        //8. 2D arrays

        int[][] matrix = {{1,2},{3,4}};
        System.out.println("2D Array:");
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[i].length;j++ ){
                System.out.print(matrix[i][j]+" ");
            }
        }
        System.out.println("");

        // Row-wise sum
        for (int i = 0; i < matrix.length;i++){
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length;j++ ){
                rowSum+=matrix[i][j];
            }
            System.out.println("Sum of row "+i+": "+rowSum);
        }
    }
}
