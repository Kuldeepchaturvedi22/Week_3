package hashmapsandhashfunctions.longestconsecutivesequence;

import java.util.HashSet;

public class SequenceFinder {
    // The array to check for the longest consecutive sequence
    private int[] arr;

    // Constructor to initialize the array
    public SequenceFinder(int[] arr) {
        this.arr = arr;
    }

    // Method to find the longest consecutive sequence
    public Sequence findLongestConsecutiveSequence() {
        // A set to store unique elements of the array for fast lookup
        HashSet<Integer> set = new HashSet<>();

        // Add all elements of the array to the set
        for (int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;
        int sequenceStart = 0;

        // Loop through each number in the set to find the longest consecutive sequence
        for (int num : set) {
            // Check if it's the start of a sequence (num - 1 does not exist in the set)
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count the consecutive numbers starting from num
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak and its start
                if (currentStreak > longestStreak) {
                    longestStreak = currentStreak;
                    sequenceStart = num;
                }
            }
        }

        return new Sequence(sequenceStart, longestStreak);
    }
}
