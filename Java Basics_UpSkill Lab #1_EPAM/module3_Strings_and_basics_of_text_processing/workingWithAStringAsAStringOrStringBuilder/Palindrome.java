package by.epam.learn.main;

class Palindrome {
    private final String[] words;

    public Palindrome(String[] words) {
        this.words = words;
    }

    public String[] isPalindrome() {
        String[] answerPalindrome = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder();
            if (lookingForPalindrome(words[i])) {
                word.append(words[i]).append(" - полиндром");
            } else word.append(words[i]).append(" - не полиндром");
            answerPalindrome[i] = word.toString();
        }
        return answerPalindrome;
    }

    public boolean lookingForPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }
}
