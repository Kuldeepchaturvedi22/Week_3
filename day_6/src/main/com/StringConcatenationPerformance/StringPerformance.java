package com.StringConcatenationPerformance;

public class StringPerformance {
    public static void stringConcatenation(String string, int operationCount) {
        // Loop to perform the concatenation operation 'operationCount' times
        for (int i = 0; i < operationCount; i++) {
            // Concatenate the string with "concat" and assign it back to the string
            string = string + "concat";
        }
    }
}