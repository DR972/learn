package by.epam.learn.main;

class MatrixFormation6 {
    private final int n;

    public MatrixFormation6(int n) {
        this.n = n;
    }

    public int[][] formation6() {
        int[][] formation = new int[n][n];
        for (int i = 0; i < formation.length; i++) {
            if (i < formation.length / 2) {
                for (int j = i; j < formation[i].length - i; j++)
                    formation[i][j] = 1;
            } else {
                for (int j = formation[i].length - i - 1; j <= i; j++)
                    formation[i][j] = 1;
            }
        }
        return formation;
    }
}
