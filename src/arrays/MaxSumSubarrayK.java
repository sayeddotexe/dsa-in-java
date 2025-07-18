package arrays;

public class MaxSumSubarrayK {
    public static int maxSum(int[] nums, int k) {
        if (nums.length < k) {
            throw new IllegalArgumentException("Window size k is larger than array length.");
        }

        int maxSum = 0;
        int windowSum = 0;

        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        maxSum = windowSum;

        // Slide the window from left to right
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
