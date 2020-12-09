package by.epam.learn.main;

class WordToLetter {
    public final String word;

    public WordToLetter(String word) {
        this.word = word;
    }

    public String changeWordToLetter() {
        return word.replaceAll("word", "letter");
    }
}
