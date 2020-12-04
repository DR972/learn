package by.epam.learn.main;

class PositiveDiagonalElements {
    private final int[][] matrix;

    public PositiveDiagonalElements(int[][] matrix) {
        this.matrix = matrix;
    }

    public String posiniveMainDiagonal() {
        StringBuilder positiveElements = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] > 0) {
                positiveElements.append("\t").append(matrix[i][i]);
            }
        }
        return positiveElements.toString();
    }
}
