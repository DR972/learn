package by.epam.learn.main;

public class SortingLexemes extends Splitting {
    private final String[] paragraphs;
    private final char letter;

    public SortingLexemes(String text, char letter) {
        this.letter = letter;
        this.paragraphs = splitParagraphs(text);
    }

    public int countLetters(String word) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                sum++;
            }
        }
        return sum;
    }

    public StringBuilder sortWords(String[] words) {
        StringBuilder sentences = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (countLetters(words[j]) > countLetters(words[i])) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
                if (countLetters(words[j]) == countLetters(words[i])) {
                    if (words[i].compareToIgnoreCase(words[j]) > 0) {
                        String temp = words[i];
                        words[i] = words[j];
                        words[j] = temp;
                    }
                }
            }
            sentences.append(words[i]).append(" ");
        }
        sentences.append(words[words.length - 1]).append(".");
        return sentences;
    }

    public String sortText() {
        StringBuilder newText = new StringBuilder();
        for (String paragraph : paragraphs) {
            String[] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String[] words = splitWords(sentence);
                newText.append(sortWords(words)).append(" ");
            }
            newText.append("\n");
        }
        return newText.toString();
    }
}
