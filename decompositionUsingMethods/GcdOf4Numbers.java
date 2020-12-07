package by.epam.learn.main;

class GcdOf4Numbers {
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    public GcdOf4Numbers(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int gcdOf4Numbers() {
        GcdAndLcm gcdAndLcm = new GcdAndLcm();
        int gcd1 = gcdAndLcm.gcd(a, b);
        if (gcd1 == 1) return gcd1;
        int gcd2 = gcdAndLcm.gcd(c, d);
        if (gcd2 == 1) return gcd2;
        return gcdAndLcm.gcd(gcd1, gcd2);
    }
}
