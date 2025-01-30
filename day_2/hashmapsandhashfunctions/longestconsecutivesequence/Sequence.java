package hashmapsandhashfunctions.longestconsecutivesequence;

public class Sequence {
    // Variables to store the sequence's start and length
    private int start;
    private int length;

    // Constructor to initialize the sequence with start and length
    public Sequence(int start, int length) {
        this.start = start;
        this.length = length;
    }

    // Getter for the starting element of the sequence
    public int getStart() {
        return start;
    }

    // Getter for the length of the sequence
    public int getLength() {
        return length;
    }

    // Method to print the sequence's starting element and length
    public void printSequence() {
        System.out.println("Longest Consecutive Sequence starts at " + start + " and has length: " + length);
    }
}
