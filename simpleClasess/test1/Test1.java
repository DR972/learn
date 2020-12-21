package by.epam.learn.main.modul3.simpleClasess;

public class Test1 {
    private int a = 3;
    private int b = 7;

    public void printTest() {
        System.out.printf("\na = %d, b = %d", a, b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        return Math.max(a, b);
    }
}
