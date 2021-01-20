package by.epam.learn.main;

class IncreasingSequence {
    private final int n;

    public IncreasingSequence(int n) {
        this.n = n;
    }

    public boolean sequence(int i) {
        DigitsNumbers digitsNumbers = new DigitsNumbers(i);
        int[] elements = digitsNumbers.elements();
        for (int j = 0; j < elements.length - 1; j++) {
            if (elements[j] >= elements[j + 1]) return false;
        }
        return true;
    }

    public String increase() {
        StringBuilder sequence = new StringBuilder();
        int number = (int) Math.pow(10, n - 1);
        for (int i = number; i < number * 10; i++) {
            if (sequence(i)) {
                sequence.append(i).append("\t");
                if ((i + 1) % 10 == 0) sequence.append("\n");
            }
        }
        return sequence.toString();
    }
}
