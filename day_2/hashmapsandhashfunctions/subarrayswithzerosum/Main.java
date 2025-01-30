package hashmapsandhashfunctions.subarrayswithzerosum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example array to test the functionality
        int[] arr = {6, -1, -3, 4, 2, 2, 1, -5, 4};

        // Create an instance of SubarrayFinder with the input array
        SubarrayFinder subarrayFinder = new SubarrayFinder(arr);

        // Find all subarrays with a sum of zero
        List<Subarray> result = subarrayFinder.findZeroSumSubarrays();

        // Print the subarrays with zero sum
        System.out.println("Subarrays with zero sum:");
        for (Subarray subarray : result) {
            subarray.printSubarray();  // Print each subarray
        }
    }
}
