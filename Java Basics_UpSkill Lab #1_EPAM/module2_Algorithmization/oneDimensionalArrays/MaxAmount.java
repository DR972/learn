package by.epam.learn.main;

class MaxAmount {
    private final double[] arr;
    private final int n;
    double[] newArr;

    public MaxAmount(double[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public void amountMax() {
        newArr = new double[n];
        for (int i=0; i<arr.length/2; i++) {
            newArr[i] = arr[i] + arr[arr.length - i - 1];
        }
    }

    public double max() {
        double maxSum = 0;
        for (double i : newArr) {
            if (i > maxSum) {
                maxSum =i;
            }
        }
        return maxSum;
    }
}
