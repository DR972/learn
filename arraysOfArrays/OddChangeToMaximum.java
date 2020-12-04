package by.epam.learn.main;

class OddChangeToMaximum {
    private final int[][] matrix;
    private int max = 0;

    public OddChangeToMaximum(int[][] matrix) {
        this.matrix = matrix;
    }

    public int maximumElement() {
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
                if (ints[j] > max) {
                    max = ints[j];
                }
            }
        }
        return max;
    }

    public int[][] oddChangeToMaximum() {
        int[][] oddToMax = new int[matrix.length][matrix[matrix.length - 1].length];
        for (int i = 0; i < oddToMax.length; i++) {
            for (int j = 0; j < oddToMax[oddToMax.length - 1].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    oddToMax[i][j] = max;
                } else oddToMax[i][j] = matrix[i][j];
            }
        }
        return oddToMax;
    }
}
