package by.epam.learn.main;

public class Brick {
    private final int x;
    private final int y;

    public Brick(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isAbleToGoThrough(int a, int b) {
        return ((Math.min(a, b) > x) && (Math.max(a, b) > y));
    }
}
