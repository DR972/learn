package by.epam.learn.main;

class SwapColumns {
    private final int[][] matrix;
    private final int columnOld;
    private final int columnNew;

    public SwapColumns(int[][] matrix, int columnOld, int columnNew) {
        this.matrix = matrix;
        this.columnOld = columnOld;
        this.columnNew = columnNew;
    }

    public int[][] swapColumns() {
        int[][] swap = new int[matrix.length][matrix[matrix.length - 1].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == columnOld) swap[i][j] = matrix[i][columnNew];
                if (j == columnNew) swap[i][j] = matrix[i][columnOld];
                if ((j != columnOld) && (j != columnNew)) swap[i][j] = matrix[i][j];
            }
        }
        return swap;
    }
}
