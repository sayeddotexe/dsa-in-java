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
}
