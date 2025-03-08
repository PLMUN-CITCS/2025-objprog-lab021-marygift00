import java.util.Scanner;

public class WordCounter {
    
    // Method to get a sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }

    // Method to count the number of words in a given sentence
    public static int countWords(String sentence) {
        // Trim removes extra spaces at the beginning or end
        // Split divides the string based on spaces
        if (sentence.trim().isEmpty()) {
            return 0; // Handle empty input as zero words
        }
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Main program flow
    public static void main(String[] args) {
        String sentence = getSentenceInput();
        int wordCount = countWords(sentence);
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
