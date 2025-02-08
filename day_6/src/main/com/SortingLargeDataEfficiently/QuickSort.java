package com.SortingLargeDataEfficiently;

public class QuickSort {

    // Method to partition the array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) { // If the current element is smaller than or equal to the pivot
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1; // Return the partitioning index
    }

    // Method to sort the array using Quick Sort
    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int part = partition(array, low, high); // Partition the array
            sort(array, low, part - 1); // Recursively sort the left sub-array
            sort(array, part + 1, high); // Recursively sort the right sub-array
        }
    }

    // Overloaded method to sort the entire array
    public static int sort(int[] array) {
        sort(array, 0, array.length - 1); // Sort the entire array
        return array[array.length - 1]; // Return the last element (for testing purposes)
    }
}