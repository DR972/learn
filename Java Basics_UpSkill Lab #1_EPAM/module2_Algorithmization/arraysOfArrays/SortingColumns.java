package by.epam.learn.main;

class SortingColumns {
    private final int[][] matrix;

    public SortingColumns(int[][] matrix) {
        this.matrix = matrix;
    }

    public int[][] sortAscending() {
        int[][] increase = new int[matrix.length][matrix[matrix.length - 1].length];
        System.arraycopy(matrix, 0, increase, 0, matrix.length);
        for (int j = 0; j < increase[increase.length - 1].length; j++) {
            for (int i = 0; i < increase.length; i++) {
                int pos = i;
                int min = increase[i][j];
                for (int k = i + 1; k < increase.length; k++) {
                    if (increase[k][j] < min) {
                        pos = k;
                        min = increase[k][j];
                    }
                }
                increase[pos][j] = increase[i][j];
                increase[i][j] = min;
            }
        }
        return increase;
    }

    public int[][] sortDescending() {
        int[][] decrease = new int[matrix.length][matrix[matrix.length - 1].length];
        System.arraycopy(matrix, 0, decrease, 0, matrix.length);
        for (int j = 0; j < decrease[decrease.length - 1].length; j++) {
            for (int i = 0; i < decrease.length; i++) {
                int pos = i;
                int max = decrease[i][j];
                for (int k = i + 1; k < decrease.length; k++) {
                    if (decrease[k][j] > max) {
                        pos = k;
                        max = decrease[k][j];
                    }
                }
                decrease[pos][j] = decrease[i][j];
                decrease[i][j] = max;
            }
        }
        return decrease;
    }
}

