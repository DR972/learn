package by.epam.learn.main;

/**
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да,
 *      то будет ли он прямоугольным.
 * 2. Найти max{min(a, b), min(c, d)}.
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 *      Определить, пройдет ли кирпич через отверстие.
 * 5. Вычислить значение функции:
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        doTriangleTask();
        doMaxMinTask();
        doStraightTask();
        doBrickTask();
        doFunctionTask();
    }

    private static void doTriangleTask() {
        Scanner scan = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("\nЗадание 1.\nВведите число a:");
        int a = scan.nextInt();
        System.out.println("Введите число b:");
        int b = scan.nextInt();

        if (triangle.triangleExists(a, b)) {
            System.out.println("Такой треугольник существует.");
            if (triangle.rightTriangle(a, b)) {
                System.out.println("и он прямоугольный.");
            }
        } else System.out.println("Такого треугольника не существует.");
    }

    private static void doMaxMinTask() {
        MaxMin MaxMin = new MaxMin(2,8,16,3);
        System.out.println("\nЗадание 2.");
        System.out.println(MaxMin.decisionMaxMin());
    }

    private static void doStraightTask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nЗадание 3.");
        System.out.println("Есть точка А(1,2) и точка В(3,6).");
        System.out.println("Введите координаты точки C:");
        Straight straight = new Straight(1, 2, 3, 6);
        int x3 = scan.nextInt();
        int y3 = scan.nextInt();

        if (straight.onOneStraightLine(x3, y3)) {
            System.out.println("Да, эти точки расположены на одной прямой.");
        } else System.out.println("Нет, эти точки не находятся на одной прямой.");
    }

    private static void doBrickTask() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nЗадание 4.\nУ нас есть обычный кирпич (250x120x65).");
        Brick brick = new Brick(65, 120);
        System.out.println("Введите размеры отверстия, в которое он пройдет:");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (brick.isAbleToGoThrough(a, b)) {
            System.out.println("Супер, кирпич проходит в отверстие!");
        } else {
            System.out.println("Не повезло, отверстие слишком маленькое.");
        }
    }

    private static void doFunctionTask() {
        System.out.println("\nЗадание 5.");
        Function function = new Function();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = scan.nextDouble();
        System.out.println("Значение функции = " + function.functionValue(x));
    }
}



