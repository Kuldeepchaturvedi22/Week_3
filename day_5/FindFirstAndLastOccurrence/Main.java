package FindFirstAndLastOccurrence;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        // Prompt for the target value
        System.out.println("Enter the target value: ");
        int target = scanner.nextInt();

        // Find and print the first and last occurrence of the target value
        int[] result = FirstAndLastOccurrence.findFirstAndLast(array, target);
        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}