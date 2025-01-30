package hashmapsandhashfunctions.pairchecker;

public class Pair {
    // Variables to store the pair of numbers
    private int first;
    private int second;

    // Constructor to initialize the pair
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    // Getter for the first number
    public int getFirst() {
        return first;
    }

    // Getter for the second number
    public int getSecond() {
        return second;
    }

    // Method to print the pair
    public void printPair() {
        System.out.println("Pair: (" + first + ", " + second + ")");
    }
}
