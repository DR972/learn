package by.epam.learn.main;

class SumIntegersIndeces {
    private final double[] arr;

    public SumIntegersIndeces(double[] arr) {
        this.arr = arr;
    }

    public double sumIntegers() {
        double sumII = arr[0];
        for (int i=2; i<=arr.length; i++) {
            boolean isprime = true;
            for (int j=2; j<=i/2; j++)
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            if (isprime)  sumII += arr[i-1];
        }
        return sumII;
    }
}
