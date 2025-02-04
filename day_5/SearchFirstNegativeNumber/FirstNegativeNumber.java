package SearchFirstNegativeNumber;

public class FirstNegativeNumber {

    // Method for finding the first negative element
    public static int findNegative(int[] array) {
        int length = array.length;

        // Applying linear search in the array to find the first negative number
        for (int index = 0; index < length; index++) {
            if (array[index] < 0) {
                return index;
            }
        }
        return -1; // Return -1 if no negative number is found
    }
}