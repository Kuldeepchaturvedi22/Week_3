package hashmapsandhashfunctions.twosumproblem;

public class Result {
    // Variables to store the indices of the two numbers
    private int index1;
    private int index2;

    // Constructor to initialize the indices
    public Result(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    // Getter for the first index
    public int getIndex1() {
        return index1;
    }

    // Getter for the second index
    public int getIndex2() {
        return index2;
    }

    // Method to print the result
    public void printResult() {
        System.out.println("Indices: (" + index1 + ", " + index2 + ")");
    }
}
