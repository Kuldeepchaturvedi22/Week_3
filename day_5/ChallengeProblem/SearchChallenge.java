package ChallengeProblem;

import java.util.Arrays;

public class SearchChallenge {

    // Method to find the first missing positive integer using linear search
    public static int findFirstMissingPositive(int[] numbers) {
        int length = numbers.length;

        // Mark numbers out of range and negative numbers
        for (int index = 0; index < length; index++) {
            if (numbers[index] <= 0 || numbers[index] > length) {
                numbers[index] = length + 1;
            }
        }

        // Mark each number as visited by making the value at the index negative
        for (int index = 0; index < length; index++) {
            int number = Math.abs(numbers[index]);
            if (number <= length) {
                numbers[number - 1] = -Math.abs(numbers[number - 1]);
            }
        }

        // Find the first positive number
        for (int index = 0; index < length; index++) {
            if (numbers[index] > 0) {
                return index + 1;
            }
        }

        return length + 1;
    }

    // Method to find the index of a target number using binary search
    public static int binarySearch(int[] numbers, int target) {
        Arrays.sort(numbers);
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                return middle;
            } else if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}