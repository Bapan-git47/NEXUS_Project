import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence or paragraph:");
        String inputText = scanner.nextLine();

        int wordCount = countWords(inputText);

        System.out.println("Number of words: " + wordCount);
    }

    private static int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        String[] words = text.split("\\s+");
        return words.length;
    }
}

