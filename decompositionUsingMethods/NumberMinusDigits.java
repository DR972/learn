package by.epam.learn.main;

public class NumberMinusDigits {
    private int n;

    public NumberMinusDigits(int n) {
        this.n = n;
    }

    public int evenDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public int subtraction() {
        int numberOfSubtractions = 0;
        while (n > 0) {
            n = n - evenDigits(n);
            numberOfSubtractions++;
        }
        return numberOfSubtractions;
    }
}

