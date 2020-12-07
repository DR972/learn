package by.epam.learn.main;

class DigitsNumbers {
    private int n;

    public DigitsNumbers(int n) {
        this.n = n;
    }

    public int[] elements() {
        int length = (int) (Math.log10(n) + 1);
        int[] elements = new int[length];
        for (int i = 0; i < elements.length; i++) {
            elements[elements.length - i - 1] = n % 10;
            n /= 10;
        }
        return elements;
    }
}
