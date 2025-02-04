package SearchFirstNegativeNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt for the length of the array
        System.out.println("Enter array length: ");
        int arrayLength = scanner.nextInt();

        // Initialize the array
        int[] array = new int[arrayLength];
        System.out.println("Enter all the elements of the array in the same line separated by spaces: ");
        for (int index = 0; index < arrayLength; index++) {
            array[index] = scanner.nextInt();
        }

        // Find and print the index of the first negative number
        int firstNegativeIndex = FirstNegativeNumber.findNegative(array);
        System.out.println("The index of the first negative number is: " + firstNegativeIndex);
    }
}