package hashmapsandhashfunctions.twosumproblem;

import java.util.HashMap;

public class TwoSum {
    // The array to check for two numbers that sum up to the target
    private int[] arr;

    // Constructor to initialize the array
    public TwoSum(int[] arr) {
        this.arr = arr;
    }

    // Method to find the two indices that add up to the target sum
    public Result findTwoSum(int target) {
        // A map to store the element and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement (target - current element)
            int complement = target - arr[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // Return the result with the indices of the two numbers
                return new Result(map.get(complement), i);
            }

            // Add the current element and its index to the map
            map.put(arr[i], i);
        }

        return null; // Return null if no such pair is found
    }
}
