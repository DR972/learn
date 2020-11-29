package by.epam.learn.main;

class Multiples {
    private final int[] arr;
    private final int k;

    public Multiples(int[] arr, int k) {
        this.arr = arr;
        this.k = k;
    }

    public int searchMultiples() {
        int sum = 0;
        for (int i : arr)
            if ((i % k) == 0) {
                sum += i;
            }
        return sum;
    }
}
