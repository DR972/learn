package by.epam.learn.main;

class MatrixFormation4 {
    private final int n;

    public MatrixFormation4(int n) {
        this.n = n;
    }

    public int[][] formation4() {
        int[][] formation = new int[n][n];
        for (int i = 0; i < formation.length; i++) {
            for (int j = 0; j < formation[i].length; j++) {
                if (i % 2 == 0) {
                    formation[i][j] = j + 1;
                } else formation[i][j] = n - j;
            }
        }
        return formation;
    }
}
