package by.epam.learn.main;

class LetterCounter {
    private final String str;

    public LetterCounter(String str) {
        this.str = str;
    }

    public String countLetters() {
        int smallLetters = 0;
        int bigLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') smallLetters++;
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') bigLetters++;
        }
        return bigLetters + ", " + smallLetters;
    }
}
