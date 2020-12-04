package by.epam.learn.main;

class MagicSquare {
    private final int n;

    public MagicSquare(int n) {
        this.n = n;
    }

    public int[][] magicSquare() {
        int[][] mS = new int[n][n];
        int number = 1;
        int i;
        int j;
        for (int k = 0; k < n; k++) {
            int l = 0;
            while (l < n) {
                i = l + k;
                j = n - 1 + l - k;
                if (i < n / 2) i += n;
                if (i >= n + n / 2) i -= n;
                if (j < n / 2) j += n;
                if (j >= n + n / 2) j -= n;
                mS[i - n / 2][j - n / 2] = number;
                l++;
                number++;
            }
        }
        return mS;
    }
}
