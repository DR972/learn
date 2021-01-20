package by.epam.learn.main;

import java.util.Arrays;

class ArrayOfKandN {
    private final int k;
    private final int n;

    public ArrayOfKandN(int k, int n) {
        this.k = k;
        this.n = n;
    }

    public int sumOfDigits(int m) {
        int sum = 0;
        while (m > 0) {
            sum += m % 10;
            m = m / 10;
        }
        return sum;
    }

    public int[] a() {
        int[] a = new int[n / k];
        int i = 0;
        for (int m = k + 9; m < n; m += +9) {
            if (sumOfDigits(m) == k) {
                a[i] = m;
                i++;
            }
        }
        return Arrays.copyOfRange(a, 0, i);
    }
}
