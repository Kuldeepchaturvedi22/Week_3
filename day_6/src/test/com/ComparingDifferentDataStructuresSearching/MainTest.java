package com.ComparingDifferentDataStructuresSearching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.TreeSet;

class MainTest {

    @Test
    void testArraySearch() {
        int[] array = {1, 2, 3, 4, 5};
        assertTrue(ArraySearch.search(array, 3));
        assertFalse(ArraySearch.search(array, 6));
    }

    @Test
    void testHashSetSearch() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        assertTrue(HashSetSearch.search(hashSet, 2));
        assertFalse(HashSetSearch.search(hashSet, 4));
    }

    @Test
    void testTreeSetSearch() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        assertTrue(TreeSetSearch.search(treeSet, 1));
        assertFalse(TreeSetSearch.search(treeSet, 5));
    }
}