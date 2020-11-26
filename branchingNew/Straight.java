package by.epam.learn.main;

class Straight {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Straight(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean onOneStraightLine (int x3, int y3) {
        int a = y1 - y2;
        int b = x2 - x1;
        int c = x2 * y1 - x1 * y2;
        return ((a * x3 + b * y3) == -c);
    }
}
