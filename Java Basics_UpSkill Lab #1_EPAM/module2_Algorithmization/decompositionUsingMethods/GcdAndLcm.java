package by.epam.learn.main;

class GcdAndLcm {

    public int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else b = b - a;
        }
        return a;
    }

    public int lcm(int a, int b) {
        System.out.println(a + "\t" + b);
        return (a * b / gcd(a, b));
    }
}
