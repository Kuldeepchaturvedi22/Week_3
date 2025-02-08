package com.StringConcatenationPerformance;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringConcatenationPerformanceTest {

    @Test
    @DisplayName("Test String Concatenation with + operator")
    void testConcatenationWithPlusOperator() {
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result += "a";
        }
        assertEquals(1000, result.length());
    }

    @Test
    @DisplayName("Test String Concatenation with StringBuilder")
    void testConcatenationWithStringBuilder() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            result.append("a");
        }
        assertEquals(1000, result.length());
    }

    @Test
    @DisplayName("Test String Concatenation with StringBuffer")
    void testConcatenationWithStringBuffer() {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            result.append("a");
        }
        assertEquals(1000, result.length());
    }
}