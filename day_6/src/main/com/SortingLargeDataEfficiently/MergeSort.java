package com.SortingLargeDataEfficiently;

public class MergeSort {
    // Method to partition the array
    public static void partition(int[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; // Find the middle point
            partition(array, left, mid); // Recursively partition the left half
            partition(array, mid + 1, right); // Recursively partition the right half
            merge(array, left, right, mid); // Merge the two halves
        }
    }

    // Method to merge two sub-arrays
    public static void merge(int[] array, int left, int right, int mid) {
        int n1 = mid - left + 1; // Size of the left sub-array
        int n2 = right - mid; // Size of the right sub-array

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;
        // Merge the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray, if any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray, if any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to sort the array using Merge Sort
    public static int sort(int[] array) {
        partition(array, 0, array.length - 1); // Partition the entire array
        return array[array.length - 1]; // Return the last element (for testing purposes)
    }
}