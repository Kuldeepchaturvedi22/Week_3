package hashmapsandhashfunctions.pairchecker;

public class Main {
    public static void main(String[] args) {
        // Example array and target sum
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        // Create an instance of PairChecker
        PairChecker pairChecker = new PairChecker(arr);

        // Find the pair with the target sum
        Pair pair = pairChecker.findPairWithSum(target);

        // Print the result
        if (pair != null) {
            pair.printPair();  // Print the pair if found
        } else {
            System.out.println("No pair with the given sum exists.");
        }
    }
}
