package by.epam.learn.main;

class MatrixFormation7 {
    private final int n;
    int plus = 0;

    public MatrixFormation7(int n) {
        this.n = n;
    }

    public float[][] formation7() {
        float[][] formation = new float[n][n];
        for (int i = 0; i < formation.length; i++) {
            for (int j = 0; j < formation[i].length - i; j++) {
                formation[i][j] = (float) Math.sin((float) (i * i - j * j) / n);
                if (formation[i][j] > 0) plus++;
            }
        }
        return formation;
    }

    public int plus() {
        return plus;
    }
}
