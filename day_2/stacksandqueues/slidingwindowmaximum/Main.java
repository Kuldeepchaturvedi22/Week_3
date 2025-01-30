package stacksandqueues.slidingwindowmaximum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example array and window size
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        // Create an instance of SlidingWindowMaximum
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum(nums, k);

        // Get the result and print it
        int[] result = slidingWindowMaximum.maxSlidingWindow();
        System.out.println("Sliding window maximums: " + Arrays.toString(result));
    }
}
