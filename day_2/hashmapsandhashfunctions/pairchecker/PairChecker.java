package hashmapsandhashfunctions.pairchecker;

import java.util.HashSet;

public class PairChecker {
    // The array to check for pairs
    private int[] arr;

    // Constructor to initialize the array
    public PairChecker(int[] arr) {
        this.arr = arr;
    }

    // Method to check if there exists a pair with the given sum
    public Pair findPairWithSum(int target) {
        // A set to store visited numbers
        HashSet<Integer> visitedNumbers = new HashSet<>();

        // Loop through each number in the array
        for (int num : arr) {
            // Check if the complement (target - num) exists in the set
            if (visitedNumbers.contains(target - num)) {
                // Return the pair as soon as it's found
                return new Pair(target - num, num);
            }

            // Add the current number to the set for future complement checks
            visitedNumbers.add(num);
        }

        return null;  // Return null if no pair with the given sum is found
    }
}
