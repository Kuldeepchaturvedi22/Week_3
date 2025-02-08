package com.StringConcatenationPerformance;

public class StringBuilderPerformance {
    public static void stringBuilderConcatenation(String string, int operationCount) {
        // Create a StringBuilder object initialized with the input string
        StringBuilder stringBuilder = new StringBuilder(string);

        // Loop to perform the append operation 'operationCount' times
        for (int i = 0; i < operationCount; i++) {
            // Append "concat" to the StringBuilder
            stringBuilder.append("concat");
        }
    }
}