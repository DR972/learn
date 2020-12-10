package by.epam.learn.main;

class NumberOfSentences {
    private final String str;

    public NumberOfSentences(String str) {
        this.str = str;
    }

    public int countSentences() {
        int sum = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '?' || str.charAt(i) == '!') {
                sum++;
            }
        }
        return sum;
    }
}
