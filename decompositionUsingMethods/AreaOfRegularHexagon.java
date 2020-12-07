package by.epam.learn.main;

class AreaOfRegularHexagon {
    private final int a;

    public AreaOfRegularHexagon(int a) {
        this.a = a;
    }

    public double areaHexagon() {
        double area;
        area = 6 * (a * a * Math.sqrt(3) / 4);
        return area;
    }
}
