package by.epam.learn.main;

class CoprimeNumbers {
    private final int a;
    private final int b;
    private final int c;

    public CoprimeNumbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean coprime() {
        GcdAndLcm gcdAndLcm = new GcdAndLcm();
        int gcd1 = gcdAndLcm.gcd(a, b);
        if (gcd1 == 1) return false;
        return gcdAndLcm.gcd(gcd1, c) != 1;
    }
}
