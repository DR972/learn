package by.epam.learn.main;

class SortingStrings {
    private final int[][] matrix;

    public SortingStrings(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] sortAscending() {
        int[][] increase = new int[matrix.length][matrix[matrix.length - 1].length];
        System.arraycopy(matrix, 0, increase, 0, matrix.length);
        for (int i = 0; i < increase.length; i++) {
            for (int j = 0; j < increase[increase.length - 1].length; j++) {
                int index = j;
                int min = increase[i][j];
                for (int k = j + 1; k < increase[increase.length - 1].length; k++) {
                    if (increase[i][k] < min) {
                        index = k;
                        min = increase[i][k];
                    }
                }
                increase[i][index] = increase[i][j];
                increase[i][j] = min;
            }
        }
        return increase;
    }

    public int[][] sortDescending() {
        int[][] decrease = new int[matrix.length][matrix[matrix.length - 1].length];
        System.arraycopy(matrix, 0, decrease, 0, matrix.length);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < decrease[decrease.length - 1].length; j++) {
                int index = j;
                int max = decrease[i][j];
                for (int k = j + 1; k < decrease[decrease.length - 1].length; k++) {
                    if (decrease[i][k] > max) {
                        index = k;
                        max = decrease[i][k];
                    }
                }
                decrease[i][index] = decrease[i][j];
                decrease[i][j] = max;
            }
        }
        return decrease;
    }
}
