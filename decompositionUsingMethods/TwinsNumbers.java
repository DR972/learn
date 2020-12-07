package by.epam.learn.main;

import java.util.Arrays;

class TwinsNumbers {
    private final int n;

    public TwinsNumbers(int n) {
        this.n = n;
    }

    public int[] primeNumbers() {
        int index = 0;
        int[] primeNumbers = new int[n];
        for (int i = n; i <= n * 2; i++) {
            int k = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    k++;
            }
            if (k < 2) primeNumbers[index++] = i;
        }
        return Arrays.copyOfRange(primeNumbers, 0, index);
    }

    public String twins() {
        StringBuilder twins = new StringBuilder();
        int[] prime = primeNumbers();
        for (int i = 1; i < prime.length; i++) {
            if (prime[i] - prime[i - 1] == 2) {
                twins.append("(").append(prime[i - 1]).append(",").append(prime[i]).append(")\t");
                i++;
            }
        }
        return twins.toString();
    }
}
