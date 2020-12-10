package by.epam.learn.main;

class LongestWord {
    private final String str;

    public LongestWord(String str) {
        this.str = str;
    }

    public String findTheLongestWord() {
        String[] words = str.split(" ");
        int wordLength = words[0].length();
        String theLongestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if (wordLength < words[i].length()) {
                wordLength = words[i].length();
                theLongestWord = words[i];
            }
        }
        return theLongestWord;
    }
}
