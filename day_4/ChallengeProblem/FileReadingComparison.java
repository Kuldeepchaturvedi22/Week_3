package ChallengeProblem;

import java.io.*;
import java.util.Scanner;

public class FileReadingComparison {

    public static void main(String[] args) {
        String filePath = "file.txt";

        // Measure time for FileReader
        long startTime = System.currentTimeMillis();
        int wordCount = countWordsUsingFileReader(filePath);
        long endTime = System.currentTimeMillis();
        System.out.println("Word count using FileReader: " + wordCount);
        System.out.println("Time taken by FileReader: " + (endTime - startTime) + " ms");

        // Measure time for InputStreamReader
        startTime = System.currentTimeMillis();
        wordCount = countWordsUsingInputStreamReader(filePath);
        endTime = System.currentTimeMillis();
        System.out.println("Word count using InputStreamReader: " + wordCount);
        System.out.println("Time taken by InputStreamReader: " + (endTime - startTime) + " ms");
    }

    private static int countWordsUsingFileReader(String filePath) {
        int wordCount = 0;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += new Scanner(line).useDelimiter("\\s+").tokens().count();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }

    private static int countWordsUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath));
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += new Scanner(line).useDelimiter("\\s+").tokens().count();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }
}