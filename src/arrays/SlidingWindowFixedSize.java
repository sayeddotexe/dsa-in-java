package arrays;

import java.util.Arrays;

public class SlidingWindowFixedSize {
    public static void slidingWindowFS(int[] nums,int k){
        System.out.println("\n"+ Arrays.toString(nums)+" window size: "+k);
        if (nums.length < k){
            System.out.println("Window is bigger than array");
            return;
        }

        int windowSum = 0;

        // Calculate the sum of the first window

        for (int i = 0 ; i < k ; i++) {
            windowSum += nums[i];

        }
        System.out.println("Window [0 to " + (k - 1) + "]: Sum = " + windowSum);

        //slide the window

        for (int i = k; i < nums.length; i++){
            windowSum += nums[i] - nums[i-k];
            System.out.println("Window [" + (i - k + 1) + " to " + i + "]: Sum = " + windowSum);
        }

    }

    public static void main(String[] args){
        System.out.println("Sliding window of Fixed Size using arrays");

        /*
         * When the input is an array of integers (int[]),
         * sliding window problems usually focus on array-based techniques like sums, averages,
         * or counts using simple variables or primitive data structures (e.g., integers, queues).
         * */

        int[] nums = {1,3,2,6,4,5};
        int k = 3;

        SlidingWindowFixedSize.slidingWindowFS(nums,k);

        System.out.println("\nMaximum Sum Subarray K");
        int result = MaxSumSubarrayK.maxSum(nums, k);
        System.out.println("Maximum sum of subarray of size " + k + " = " + result);
    }
}
