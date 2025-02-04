package CompareStringBufferwithStringBuilderforStringConcatenation;

public class Main {
    public static void main(String[] args) {
        int numberOfStrings = 1_000_000;
        String stringToAppend = "hello";

        // Measure time for StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();
        for (int i = 0; i < numberOfStrings; i++) {
            stringBuffer.append(stringToAppend);
        }
        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // Measure time for StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();
        for (int i = 0; i < numberOfStrings; i++) {
            stringBuilder.append(stringToAppend);
        }
        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // Output the time taken by both classes for comparison
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");
    }
}