package com.SortingLargeDataEfficiently;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.println("Enter length of an array: ");
        int length = scanner.nextInt();

        // Initialize the array with the specified length
        int[] array = new int[length];

        // Create a Random object to generate random numbers
        Random random = new Random();

        // Fill the array with random numbers between 1 and 10000
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10000) + 1;
        }

        // Measure and print the time taken by Bubble Sort
        long bubbleSortInitialTime = System.nanoTime();
        System.out.println(BubbleSort.bubbleSort(array));
        long bubbleSortTime = System.nanoTime();
        System.out.println("Time taken by bubble sort is: " + (bubbleSortTime - bubbleSortInitialTime));

        // Measure and print the time taken by Merge Sort
        long mergeSortInitialTime = System.nanoTime();
        System.out.println(MergeSort.sort(array));
        long mergeSortTime = System.nanoTime();
        System.out.println("Time taken by merge sort is: " + (mergeSortTime - mergeSortInitialTime));

        // Measure and print the time taken by Quick Sort
        long quickSortInitialTime = System.nanoTime();
        System.out.println(QuickSort.sort(array));
        long quickSortTime = System.nanoTime();
        System.out.println("Time taken by quick sort is: " + (quickSortTime - quickSortInitialTime));
    }
}