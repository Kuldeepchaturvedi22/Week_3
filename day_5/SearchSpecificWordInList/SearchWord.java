package SearchSpecificWordInList;

public class SearchWord {

    // Method to search for a specific word in an array of strings
    public static String searchSpecificWord(String[] stringArray, String word) {
        int stringArrayLength = stringArray.length;

        // Iterate through each string in the array
        for (int i = 0; i < stringArrayLength; i++) {
            // Split the current string into words
            String[] wordsArray = stringArray[i].split(" ");

            // Iterate through each word in the current string
            for (int j = 0; j < wordsArray.length; j++) {
                // Check if the current word matches the specific word
                if (word.equals(wordsArray[j])) {
                    return stringArray[i]; // Return the string containing the word
                }
            }
        }
        return "Not Found"; // Return "Not Found" if the word is not found in any string
    }
}