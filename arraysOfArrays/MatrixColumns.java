package by.epam.learn.main;

class MatrixColumns {
    private final int[][] matrix;
    int number = 0;

    public MatrixColumns(int[][] matrix) {
        this.matrix = matrix;
    }

    public int numberOfColumns() {

        for (int j = 0; j < matrix[matrix.length - 1].length; j += 2) {
            if (matrix[0][j] > matrix[matrix.length - 1][j]) number++;
        }
        return number;
    }

    public int[][] searchMatrixColumns() {
        int number = numberOfColumns();
        int k = -1;
        int[][] newMatrix = new int[matrix.length][number];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    k++;
                    newMatrix[i][k] = matrix[i][j];
                }
            }
            k = -1;
        }
        return newMatrix;
    }
}
