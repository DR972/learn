package by.epam.learn.main;

class NumberOfDigits {
    private final String str;

    public NumberOfDigits(String str) {
        this.str = str;
    }

    public int countDigits() {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                sum++;
            }
        }
        return sum;
    }
}
