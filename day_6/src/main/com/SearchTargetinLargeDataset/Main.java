package com.SearchTargetinLargeDataset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Used scanner object for taking input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int length = scanner.nextInt();

        // Declare array of size lenght
        int [] array = new int[length];

        // Initializing array
        for(int i=0;i<length;i++){
            array[i] = i;
        }

        System.out.println("Enter target between "+0+" to "+length);
        int target = scanner.nextInt();

        // Calling method and checking their execution time
        long linearSearchInitialTime = System.nanoTime();
        System.out.println(LinearSearch.searchTarget(array,target));
        long linearSearchTime = System.nanoTime();
        long binarySearchInitialTime = System.nanoTime();
        System.out.println(BinarySearch.searchTarget(array,target));
        long binarySearchTime = System.nanoTime();

        // Output time taken by both search algorithm
        System.out.println("Time taken by linear search is: "+ (linearSearchTime-linearSearchInitialTime));
        System.out.println("Time taken by binary search is: "+ (binarySearchTime-binarySearchInitialTime));
    }
}
