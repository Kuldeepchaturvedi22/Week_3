package hashmapsandhashfunctions.twosumproblem;

public class Main {
    public static void main(String[] args) {
        // Example array and target sum
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        // Create an instance of TwoSum
        TwoSum twoSum = new TwoSum(arr);

        // Find the two indices that sum up to the target
        Result result = twoSum.findTwoSum(target);

        // Print the result
        if (result != null) {
            result.printResult();  // Print the indices if a pair is found
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}
