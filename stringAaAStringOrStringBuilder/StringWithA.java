package by.epam.learn.main;

class StringWithA {
    private final String str;
    private final char letter;

    public StringWithA(String str, char letter) {
        this.str = str;
        this.letter = letter;
    }

    public int lookingForTheLetterA() {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) sum++;
        }
        return sum;
    }
}
