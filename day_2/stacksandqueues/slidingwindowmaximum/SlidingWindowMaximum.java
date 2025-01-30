package stacksandqueues.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    private int[] nums;
    private int k;

    // Constructor to initialize the array and window size
    public SlidingWindowMaximum(int[] nums, int k) {
        this.nums = nums;
        this.k = k;
    }

    // Method to calculate the maximum of each sliding window
    public int[] maxSlidingWindow() {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        int[] result = new int[n - k + 1];  // To store the result
        Deque<Integer> deque = new LinkedList<>();  // Deque to store indices

        // Loop through the array
        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove indices whose corresponding values are less than the current element
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current element's index to the deque
            deque.offerLast(i);

            // Start adding results to the output array once the window reaches size k
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;  // Return the final result array
    }
}
