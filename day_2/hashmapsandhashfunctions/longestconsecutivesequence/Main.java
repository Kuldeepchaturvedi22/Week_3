package hashmapsandhashfunctions.longestconsecutivesequence;

public class Main {
    public static void main(String[] args) {
        // Example array to test the functionality
        int[] arr = {100, 4, 200, 1, 3, 2};

        // Create an instance of SequenceFinder
        SequenceFinder sequenceFinder = new SequenceFinder(arr);

        // Find the longest consecutive sequence
        Sequence sequence = sequenceFinder.findLongestConsecutiveSequence();

        // Print the result
        sequence.printSequence();
    }
}
