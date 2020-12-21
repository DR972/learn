package by.epam.learn.main.modul3.simpleClasess;

import java.awt.Point;
import java.util.Locale;

public class Triangle {
    private final Point A;
    private final Point B;
    private final Point C;
    private final double a;
    private final double b;
    private final double c;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        a = calculateSide(this.A, this.B);
        b = calculateSide(this.B, this.C);
        c = calculateSide(this.A, this.C);
    }

    public double calculateSide(Point A, Point B) {
        return Math.sqrt(Math.pow(A.getX() - B.getX(), 2) + Math.pow(A.getY() - B.getY(), 2));
    }

    public double calculatePerimeter() {
        return a + b + c;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String pointMedianIntersection() {
        double x = (A.getX() + B.getX() + C.getX()) / 3;
        double y = (A.getY() + B.getY() + C.getY()) / 3;
        return String.format(Locale.US, "(%.2f,%.2f)", x, y);
    }
}