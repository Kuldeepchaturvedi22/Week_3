package hashmapsandhashfunctions.subarrayswithzerosum;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class SubarrayFinder {
    // The array to store input elements
    private int[] arr;

    // Constructor to initialize the array
    public SubarrayFinder(int[] arr) {
        this.arr = arr;
    }

    // Method to find all subarrays with a sum of zero
    public List<Subarray> findZeroSumSubarrays() {
        // List to store the subarrays with zero sum
        List<Subarray> result = new ArrayList<>();

        // HashMap to store the cumulative sum and the indices where it occurs
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Variable to track the cumulative sum
        int sum = 0;

        // Initialize map with sum 0 at index -1 (for cases where sum of subarray is zero from the beginning)
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        // Loop through the array to find zero-sum subarrays
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Add current element to the cumulative sum

            // If the sum is already in the map, it means there exists a zero-sum subarray
            if (map.containsKey(sum)) {
                // For each index where the sum was found, add the subarray
                for (int index : map.get(sum)) {
                    // Create a subarray from index + 1 to current index i
                    List<Integer> subarrayElements = new ArrayList<>();
                    for (int j = index + 1; j <= i; j++) {
                        subarrayElements.add(arr[j]);
                    }
                    result.add(new Subarray(subarrayElements));  // Add the subarray to result
                }
            }

            // Add the current index to the map for the current sum
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        // Return the list of subarrays with zero sum
        return result;
    }
}
