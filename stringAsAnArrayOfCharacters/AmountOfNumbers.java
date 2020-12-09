package by.epam.learn.main;

class AmountOfNumbers {
    private final String str;

    public AmountOfNumbers(String str) {
        this.str = str;
    }

    public int countNumbers() {
        int countNumbers = 0;
        int countDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                countDigits++;
            } else {
                if (countDigits > 0) {
                    countNumbers++;
                    countDigits = 0;
                }
            }
        }
        return countNumbers;
    }
}
