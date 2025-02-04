package FindRotationPointInRotatedSortedArray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create scanner object to take input from user
        Scanner scanner = new Scanner(System.in);

        // Prompt for the length of the array
        System.out.println("Enter length of array: ");
        int arrayLength = scanner.nextInt();

        // Initialize the array
        int[] array = new int[arrayLength];
        System.out.println("Enter array elements: ");
        for (int index = 0; index < arrayLength; index++) {
            array[index] = scanner.nextInt();
        }

        // Find and print the rotation point of the array
        int rotationPoint = FindRotationPoint.findRotationPoint(array, 0, array.length - 1);
        System.out.println("Rotation point: " + rotationPoint);
    }
}