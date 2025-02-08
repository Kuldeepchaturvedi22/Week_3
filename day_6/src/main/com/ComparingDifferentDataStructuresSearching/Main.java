package com.ComparingDifferentDataStructuresSearching;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Used scanner object to take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size :");
        int size = scanner.nextInt();
        System.out.println("Enter target which is being search : ");
        int target = scanner.nextInt();

        // Initializing array, hashset and treeset
        int[] array = new int[size];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Populating array, hashset and treeset with values
        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Measure time for Array search
        long startTime = System.nanoTime();
        boolean arrayResult = ArraySearch.search(array, target);
        long endTime = System.nanoTime();
        long arrayTime = endTime - startTime;

        // Measure time for HashSet search
        startTime = System.nanoTime();
        boolean hashSetResult = HashSetSearch.search(hashSet, target);
        endTime = System.nanoTime();
        long hashSetTime = endTime - startTime;

        // Measure time for TreeSet search
        startTime = System.nanoTime();
        boolean treeSetResult = TreeSetSearch.search(treeSet, target);
        endTime = System.nanoTime();
        long treeSetTime = endTime - startTime;

        // Print results
        System.out.println("Dataset size: " + size);
        System.out.println("Array search time: " + arrayTime / 1_000_000.0 + " ms");
        System.out.println("HashSet search time: " + hashSetTime / 1_000_000.0 + " ms");
        System.out.println("TreeSet search time: " + treeSetTime / 1_000_000.0 + " ms");
        System.out.println();
    }
}