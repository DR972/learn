package by.epam.learn.main;

class TheSumOfFactorials {

    private final int k;
    private final int m;
    private final int step;

    public TheSumOfFactorials(int k, int m, int step) {
        this.k = k;
        this.m = m;
        this.step = step;
    }

    public int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public int sumFactorial() {
        int sum = 0;
        for (int i = k; i <= m; i += step) {
            sum += factorial(i);
        }
        return sum;
    }
}
