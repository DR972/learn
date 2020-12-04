package by.epam.learn.main;

class ColumnSums {
    private final int[][] matrix;

    public ColumnSums(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[] columnSums() {
        int[] sums = new int[matrix[matrix.length - 1].length];
        for (int[] i : matrix) {
            for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
                sums[j] += i[j];
            }
        }
        return sums;
    }

    public int maxColumnSum() {
        int[] sums = columnSums();
        int maxSum = sums[0];
        int indexMaxSum = 0;
        for (int i = 1; i < sums.length; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
                indexMaxSum = i;
            }
        }
        return indexMaxSum;
    }
}
