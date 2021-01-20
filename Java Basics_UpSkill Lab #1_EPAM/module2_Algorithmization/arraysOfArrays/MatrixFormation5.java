package by.epam.learn.main;

class MatrixFormation5 {
    private final int n;

    public MatrixFormation5(int n) {
        this.n = n;
    }

    public int[][] formation5() {
        int[][] formation = new int[n][n];
        for (int i = 0; i < formation.length; i++) {
            for (int j = 0; j < formation[i].length - i; j++)
                formation[i][j] = i + 1;
        }
        return formation;
    }
}
