package by.epam.learn.main;

class MaxMin {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public MaxMin(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int decisionMaxMin() {
        return (Math.max(Math.min(a, b), Math.min(c, d)));
    }
}
