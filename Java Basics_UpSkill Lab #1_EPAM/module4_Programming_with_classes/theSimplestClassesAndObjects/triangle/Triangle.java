package by.epam.learn.main.modul3.simpleClasess;

import java.awt.Point;
import java.util.Locale;

public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;
    private final double ab;
    private final double bc;
    private final double ac;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        ab = calculateSide(this.a, this.b);
        bc = calculateSide(this.b, this.c);
        ac = calculateSide(this.a, this.c);
    }

    public double calculateSide(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    public double calculatePerimeter() {
        return ab + bc + ac;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public String pointMedianIntersection() {
        double x = (a.getX() + b.getX() + c.getX()) / 3;
        double y = (a.getY() + b.getY() + c.getY()) / 3;
        return String.format(Locale.US, "(%.2f,%.2f)", x, y);
    }
}