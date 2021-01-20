package by.epam.learn.main;

class SumOf3ArrayElements {
    private final int[] array;
    private final int k;
    private final int m;

    public SumOf3ArrayElements(int[] array, int k, int m) {
        this.array = array;
        this.k = k;
        this.m = m;
    }

    public int[] sum3Elements() {
        int[] sum3 = new int[m - k - 1];
        for (int i = k + 1; i < m; i++) {
            sum3[i - k - 1] = array[i - 1] + array[i] + array[i + 1];
        }
        return sum3;
    }
}
