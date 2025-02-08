package com.SearchTargetinLargeDataset;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("This test checks the array of 1,000")
    void Test1 () {
        int [] array = new int[1000];
        for(int i=0;i<array.length;i++){
            array[i] =i;
        }

        int linearSearch = LinearSearch.searchTarget(array,800);
        int binarySearch = BinarySearch.searchTarget(array,800);

        assertEquals(800,linearSearch);
        assertEquals(800,binarySearch);
    }

    @Test
    @DisplayName("This test checks the array of 10,000")
    void Test2 () {
        int [] array = new int[10000];
        for(int i=0;i<array.length;i++){
            array[i] =i;
        }

        int linearSearch = LinearSearch.searchTarget(array,8000);
        int binarySearch = BinarySearch.searchTarget(array,8000);

        assertEquals(8000,linearSearch);
        assertEquals(8000,binarySearch);
    }

    @Test
    @DisplayName("This test checks the array of 1,000,000")
    void Test3 () {
        int [] array = new int[1000000];
        for(int i=0;i<array.length;i++){
            array[i] =i;
        }

        int linearSearch = LinearSearch.searchTarget(array,800000);
        int binarySearch = BinarySearch.searchTarget(array,800000);

        assertEquals(800000,linearSearch);
        assertEquals(800000,binarySearch);
    }
}