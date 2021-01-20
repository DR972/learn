package by.epam.learn.main;

class UnionOfArray {
    private final int[] firstArray;
    private final int[] secondArray;
    private final int k;

    public UnionOfArray(int[] firstArray, int[] secondArray, int k) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        this.k = k;
    }

    public int[] newArray() {
        int[] newArray = new int[firstArray.length + secondArray.length];
        for (int i = 0; i < newArray.length; i++) {
            if (i <= k) {
                newArray[i] = firstArray[i];
            }
            if (i > k & i <= k + secondArray.length) {
                newArray[i] = secondArray[i - k - 1];
            }
            if (i > k + secondArray.length) {
                newArray[i] = firstArray[i - secondArray.length];
            }
        }
        return newArray;
    }
}
