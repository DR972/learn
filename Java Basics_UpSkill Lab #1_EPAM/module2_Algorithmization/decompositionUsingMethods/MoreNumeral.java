package by.epam.learn.main;

class MoreNumeral {
    private final int n;
    private final int m;

    public MoreNumeral(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public int more() {
        if ((int) (Math.log10(n) + 1) == (int) (Math.log10(m) + 1)) return 0;
        if ((int) (Math.log10(n) + 1) > (int) (Math.log10(m) + 1)) return n;
        else return m;
    }
}
