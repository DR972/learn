package by.epam.learn.main;

public class SortingWordsByLength extends Splitting {
    private final String[] paragraphs;

    public SortingWordsByLength(String text) {
        paragraphs = splitParagraphs(text);
    }

    public StringBuilder sortWords(String[] words) {
        StringBuilder sentences = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].length() < words[i].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
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
