package com.SortingLargeDataEfficiently;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("This test checks the array of length 1000")
    void test1() {
        // Create an array of length 1000
        int[] array = new int[1000];
        Random random = new Random();

        // Fill the array with random numbers between 1 and 10000
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000) + 1;
        }

        // Sort the array using different sorting algorithms
        int bubbleSortTest = BubbleSort.bubbleSort(array);
        int mergeSortTest = MergeSort.sort(array);
        int quickSortTest = QuickSort.sort(array);

        // Sort the array using Java's built-in sort for comparison
        Arrays.sort(array);

        // Assert that the highest value is the same for all sorting methods
        assertEquals(array[array.length - 1], bubbleSortTest);
        assertEquals(array[array.length - 1], mergeSortTest);
        assertEquals(array[array.length - 1], quickSortTest);
    }

    @Test
    @DisplayName("This test checks the array of length 10,000")
    void test2() {
        // Create an array of length 10,000
        int[] array = new int[10000];
        Random random = new Random();

        // Fill the array with random numbers between 1 and 10000
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000) + 1;
        }

        // Sort the array using different sorting algorithms
        int bubbleSortTest = BubbleSort.bubbleSort(array);
        int mergeSortTest = MergeSort.sort(array);
        int quickSortTest = QuickSort.sort(array);

        // Sort the array using Java's built-in sort for comparison
        Arrays.sort(array);

        // Assert that the highest value is the same for all sorting methods
        assertEquals(array[array.length - 1], bubbleSortTest);
        assertEquals(array[array.length - 1], mergeSortTest);
        assertEquals(array[array.length - 1], quickSortTest);
    }

    @Test
    @DisplayName("This test checks the array of length 1,000,000")
    void test3() {
        // Create an array of length 1,000,000
        int[] array = new int[1000000];
        Random random = new Random();

        // Fill the array with random numbers between 1 and 10000
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000) + 1;
        }

        // Sort the array using different sorting algorithms
        int bubbleSortTest = BubbleSort.bubbleSort(array);
        int mergeSortTest = MergeSort.sort(array);
        int quickSortTest = QuickSort.sort(array);

        // Sort the array using Java's built-in sort for comparison
        Arrays.sort(array);

        // Assert that the highest value is the same for all sorting methods
        assertEquals(array[array.length - 1], bubbleSortTest);
        assertEquals(array[array.length - 1], mergeSortTest);
        assertEquals(array[array.length - 1], quickSortTest);
    }
}