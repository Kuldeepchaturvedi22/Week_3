package com.RecursiveVsIterativeFibonacciComputation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testRecursiveFibonacci() {
        assertEquals(0, Recursive.fibonacciRecursive(0));
        assertEquals(1, Recursive.fibonacciRecursive(1));
        assertEquals(1, Recursive.fibonacciRecursive(2));
        assertEquals(2, Recursive.fibonacciRecursive(3));
        assertEquals(3, Recursive.fibonacciRecursive(4));
        assertEquals(5, Recursive.fibonacciRecursive(5));
        assertEquals(8, Recursive.fibonacciRecursive(6));
        assertEquals(13, Recursive.fibonacciRecursive(7));
    }

    @Test
    void testIterativeFibonacci() {
        assertEquals(0, Iterative.fibonacciIterative(0));
        assertEquals(1, Iterative.fibonacciIterative(1));
        assertEquals(1, Iterative.fibonacciIterative(2));
        assertEquals(2, Iterative.fibonacciIterative(3));
        assertEquals(3, Iterative.fibonacciIterative(4));
        assertEquals(5, Iterative.fibonacciIterative(5));
        assertEquals(8, Iterative.fibonacciIterative(6));
        assertEquals(13, Iterative.fibonacciIterative(7));
    }
}