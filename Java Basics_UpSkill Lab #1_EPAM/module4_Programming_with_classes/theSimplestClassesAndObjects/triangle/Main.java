package by.epam.learn.main.modul3.simpleClasess;

/**
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов,
 * вычисления площади, периметра и точки пересечения медиан.
 */

import java.awt.Point;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Point A = new Point((int) (Math.random() * 20 - 9), (int) (Math.random() * 20 - 9));
        Point B = new Point((int) (Math.random() * 20 - 9), (int) (Math.random() * 20 - 9));
        Point C = new Point((int) (Math.random() * 20 - 9), (int) (Math.random() * 20 - 9));
        System.out.printf(Locale.US, "\nЗаданы три точки на плоскости: \n A(%.1f,%.1f);" +
                " B(%.1f,%.1f); C(%.1f,%.1f).%n", A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY());

        Triangle triangle = new Triangle(A, B, C);
        System.out.printf(Locale.US, "Длины сторон треугольника: %.2f; %.2f; %.2f\n",
                triangle.calculateSide(A, B), triangle.calculateSide(B, C), triangle.calculateSide(A, C));
        System.out.printf(Locale.US, "Периметр треугольника: %.2f\n", triangle.calculatePerimeter());
        System.out.printf(Locale.US, "Площадь треугольника: %.2f\n", triangle.calculateArea());
        System.out.println("Точка пересечения медиан треугольника: " + triangle.pointMedianIntersection());
    }
}