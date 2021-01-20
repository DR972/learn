package by.epam.learn.main;

class Diagonals {
    private final int[][] matrix;

    public Diagonals(int[][] matrix) {
        this.matrix = matrix;
    }

    public String mainDiagonal() {
        StringBuilder mainD = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            mainD.append("\t").append(matrix[i][i]);
        }
        return mainD.toString();
    }

    public String sideDiagonal() {
        StringBuilder sideD = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            sideD.append("\t").append(matrix[matrix.length - i - 1][i]);
        }
        return sideD.toString();
    }
}
