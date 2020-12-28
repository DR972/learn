package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class Text {
    private final Word heading;
    ArrayList<Sentence> content;

    public Text(Word heading, ArrayList<Sentence> content) {
        this.heading = heading;
        this.content = content;
    }

    void addSentence(String sentence) {
        content.add(new Sentence(sentence));
    }

    public Word getHeading() {
        return heading;
    }

    public ArrayList<Sentence> getContent() {
        return content;
    }
}
