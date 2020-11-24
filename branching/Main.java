package by.epam.learn.main;

public class Main {
    public static void main(String[] args) {
        Triangle T = new Triangle();
        System.out.println(T.s);
        MaxMin Max = new MaxMin();
        System.out.println("max(min(a,b),min(c,d)) = " + Max.m);
        Straight S = new Straight();
        System.out.println(S.s);
        Brick B = new Brick();
        System.out.println(B.s);
        Function F = new Function();
        System.out.println(F.f);
    }
}
