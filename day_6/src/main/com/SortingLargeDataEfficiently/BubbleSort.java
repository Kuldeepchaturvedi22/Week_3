package com.SortingLargeDataEfficiently;

public class BubbleSort {
    // Method for implementing bubble sort
    public static int bubbleSort(int[] array) {
        int length = array.length;

        // Implement bubble sort using two loops
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Return the highest value of the array (for testing purposes)
        return array[length - 1];
    }
}