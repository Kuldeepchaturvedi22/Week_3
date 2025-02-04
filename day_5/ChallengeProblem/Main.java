package ChallengeProblem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the list of integers
        System.out.println("Enter the number of elements in the list: ");
        int numberOfElements = scanner.nextInt();
        int[] numbers = new int[numberOfElements];
        System.out.println("Enter the elements of the list: ");
        for (int index = 0; index < numberOfElements; index++) {
            numbers[index] = scanner.nextInt();
        }

        // Find the first missing positive integer
        int firstMissingPositive = SearchChallenge.findFirstMissingPositive(numbers);
        System.out.println("The first missing positive integer is: " + firstMissingPositive);

        // Input the target number for binary search
        System.out.println("Enter the target number to search: ");
        int target = scanner.nextInt();

        // Find the index of the target number using binary search
        int targetIndex = SearchChallenge.binarySearch(numbers, target);
        System.out.println("The index of the target number is: " + targetIndex);
    }
}
