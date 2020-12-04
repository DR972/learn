package by.epam.learn.main;

class ColumnPRowK {
    private final int[][] matrix;
    private final int k;
    private final int p;

    public ColumnPRowK(int[][] matrix, int k, int p) {
        this.matrix = matrix;
        this.k = k;
        this.p = p;
    }

    public String row() {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < matrix[matrix.length - 1].length; i++) {
            row.append("\t").append(matrix[k - 1][i]);
        }
        return row.toString();
    }

    public String column() {
        StringBuilder column = new StringBuilder();
        for (int[] ints : matrix) {
            column.append("\t").append(ints[p - 1]);
        }
        return column.toString();
    }
}
