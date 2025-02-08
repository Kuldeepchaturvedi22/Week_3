package com.StringConcatenationPerformance;

public class StringBufferPerformance {
    public static void stringBufferConcatenation(String string, int operationCount) {
        // Create a StringBuffer object initialized with the input string
        StringBuffer stringBuffer = new StringBuffer(string);

        // Loop to perform the append operation 'operationCount' times
        for (int i = 0; i < operationCount; i++) {
            // Append "concat" to the StringBuffer
            stringBuffer.append("concat");
        }
    }
}