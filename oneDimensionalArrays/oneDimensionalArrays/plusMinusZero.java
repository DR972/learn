package by.epam.learn.main;

class PlusMinusZero {
    public int minus = 0;
    public int plus = 0;
    private final double[] arr;

    public PlusMinusZero(double[] arr) {
        this.arr = arr;
    }

    public int minus() {
        for (double i : arr) {
            if (i < 0) minus++;
            if (i > 0) plus++;
        }
        return minus;
    }

    public int plus() {
        return plus;
    }
}
