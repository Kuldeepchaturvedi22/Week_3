package ConvertBinaryStreamtoCharacterStreamUsingInputStreamReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BinaryToCharacter {
    public static void convertBinaryToCharacter(String filePath) {
        // Use try-with-resources to ensure the streams are closed automatically
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            // Read each line from the file and print it
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Print the stack trace if an IOException occurs
            e.printStackTrace();
        }
    }
}