package by.epam.learn.main;

public class SortingParagraphs {
    private final String text;
    static public int maxSentence;
    static public String[] paragraphs;

    public SortingParagraphs(String text) {
        this.text = text;
    }

    public int[] sortSentences() {
        Splitting splitting = new Splitting();
        paragraphs = splitting.splitParagraphs(text);
        int[] numberOfSentences = new int[paragraphs.length];
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = splitting.splitSentences(paragraphs[i]);
            numberOfSentences[i] = sentences.length;
            if (maxSentence < numberOfSentences[i]) {
                maxSentence = numberOfSentences[i];
            }
        }
        return numberOfSentences;
    }

    public String sortParagraphs() {
        StringBuilder newParagraphs = new StringBuilder();
        sortSentences();
        for (int i = 1; i <= maxSentence; i++) {
            for (int j = 0; j < paragraphs.length; j++) {
                if (sortSentences()[j] == i) {
                    newParagraphs.append(paragraphs[j]).append("\n");
                }
            }
        }
        return newParagraphs.toString();
    }
}
