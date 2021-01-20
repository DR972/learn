package by.epam.learn.main;

class AreaOfQuadrangle {
    private final int x;
    private final int y;
    private final int z;
    private final int t;
    private double c;
    private double triangle1;
    private double triangle2;

    public AreaOfQuadrangle(int x, int y, int z, int t) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.t = t;
    }

    public boolean existence() {
        int max4 = Math.max(Math.max(x, y), Math.max(z, t));
        c = Math.sqrt(x * x + y * y);
        double max3 = Math.max(c, Math.max(z, t));
        return (max4 >= (x + y + z + t - max4) || max3 >= (c + z + t + -max3));
    }

    public double convex() {
        double p = (z + t + c) / 2.0;
        triangle1 = x * y / 2.0;
        triangle2 = Math.sqrt(p * (p - z) * (p - t) * (p - c));
        return (triangle1 + triangle2);
    }

    public double concave() {
        if (triangle1 > triangle2) return (triangle1 - triangle2);
        else return 0;
    }
}
