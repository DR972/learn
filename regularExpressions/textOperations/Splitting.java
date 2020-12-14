package by.epam.learn.main;

public class Splitting {

    public String[] splitParagraphs(String text) {
        return text.split("\n");
    }

    public String[] splitSentences(String text) {
        return text.split("\\.*[.!?]\\s*");
    }

    public String[] splitWords(String sentence) {
        return sentence.split("\\s*(\\s|,|;|:)\\s*");
    }
}
