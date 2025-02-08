package com.SearchTargetinLargeDataset;

public class BinarySearch {

    // Method for searching element from array using binary search
    public static int searchTarget (int [] array,int target) {

        // Assigning left right pointer for binary search
        int left = 0;
        int right = array.length-1;

        // Implementing binary search
        while(left<=right){
            int mid = left+(right-left)/2;
            if(array[mid]==target){
                return target;
            }
            else if(target>array[mid]){
                left = mid+1;
            }
            else if(target<array[mid]){
                right = mid-1;
            }
        }

        // If target is not found return -1
        return -1;
    }
}
