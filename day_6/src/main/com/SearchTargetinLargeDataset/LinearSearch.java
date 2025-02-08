package com.SearchTargetinLargeDataset;

public class LinearSearch {
    // Method for searching element from array using linear search

    public static int searchTarget (int [] array,int target) {

        // Loop for search target in array
        for(int i=0;i<array.length;i++){
            if(array[i] == target){
                return target;
            }
        }

        // If target is not found return -1
        return -1;
    }
}
