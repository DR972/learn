package by.epam.learn.main;

class LinesWith5 {
    private final int[][] matrix;

    public LinesWith5(int[][] matrix) {
        this.matrix = matrix;
    }

    public String linesWith5() {
        StringBuilder lineNumbers = new StringBuilder();
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
                if (matrix[i][j] == 5) {
                    sum++;
                    if (sum == 3) {
                        lineNumbers.append(i + 1).append("\t");
                    }
                }
            }
        }
        return lineNumbers.toString();
    }
}
