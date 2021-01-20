package by.epam.learn.main;

class RandomMatrix {
    private final int n;
    private final int m;

    public RandomMatrix(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int[][] matrixRandom() {
        int[][] matrixRandom = new int[m][n];
        for (int j = 0; j < matrixRandom[matrixRandom.length - 1].length; j++) {
            int i = j;
            int[] index = random();
            while (i >= 0) {
                matrixRandom[index[i]][j] = 1;
                i--;
            }
        }
        return matrixRandom;
    }

    public int[] random() {
        int[] index = new int[m];
        for (int i = 0; i < index.length; i++) {
            index[i] = (int) (Math.random() * m);
            for (int j = i - 1; j >= 0; j--) {
                if (index[j] == index[i]) {
                    i--;
                    break;
                }
            }
        }
        return index;
    }
}