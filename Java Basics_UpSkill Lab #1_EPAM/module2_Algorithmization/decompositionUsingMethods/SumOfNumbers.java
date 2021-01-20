package by.epam.learn.main;

class SumOfNumbers {
    private final int n;

    public SumOfNumbers(int n) {
        this.n = n;
    }

    public boolean oddDigits(int i) {
        DigitsNumbers digitsNumbers = new DigitsNumbers(i);
        int[] elements = digitsNumbers.elements();
        for (int element : elements) {
            if (element % 2 == 0) return false;
        }
        return true;
    }

    public long sum() {
        long sum = 0;
        int number = (int) Math.pow(10, n - 1);
        for (int i = number; i < number * 10; i++) {
            if (oddDigits(i)) sum += i;
        }
        return sum;
    }

    public int evenDigits() {
        int quantity = 0;
        long sum = sum();
        while (sum > 0) {
            if ((sum % 10) % 2 == 0) quantity++;
            sum /= 10;
        }
        return quantity;
    }
}
