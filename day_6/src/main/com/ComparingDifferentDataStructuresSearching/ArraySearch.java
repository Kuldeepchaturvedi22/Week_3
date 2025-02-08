package com.ComparingDifferentDataStructuresSearching;

public class ArraySearch {
    public static boolean search(int[] array, int key) {
        // Iterate through each element in the array
        for (int element : array) {
            // Check if the current element matches the key
            if (element == key) {
                return true; // Key found
            }
        }
        return false; // Key not found
    }
}