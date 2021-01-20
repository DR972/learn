package by.epam.learn.main;

/**
 * 1. Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *          (b+sqrt(b^2+4ac))/2a -2^3*c + b^(-2)
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *          (sin x + cos y)/(cos x - sin y) *tg xy
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 *      Поменять местами дробную и целую части числа и вывести полученное значение числа.
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
 *      Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
 *      ННч ММмин SSc.
 * 6. Для данной области составить линейную программу, которая печатает true,
 *      если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае:
 */

public class Main {

    static class Arithmetic {
        static public void arith(int a, int b, int c) {
            double z = (((a - 3.0) * b / 2) + c);
            System.out.println(z);
        }
    }

    static class Fractions {
        static public void fract(double a, double b, double c) {
            double d = (b + Math.sqrt(b * b + 4.0 * a * c)) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
            System.out.println(d);
        }
    }

    static class Trigonometry {
        static public void trig(double x, double y) {
            double x1 = Math.toRadians(x);
            double y1 = Math.toRadians(y);
            double r1 = Math.toRadians(x * y);
            double z = ((Math.sin(x1) + Math.cos(y1)) / (Math.cos(x1) - Math.sin(y1))) * Math.tan(r1);
            System.out.println(z);
        }
    }

    static class Replacement {
        static public void repl(double r) {
            int n = (int) r;
            int d = (int) (r * 1000 - n * 1000);
            double newR = d + (double) n / 1000;
            System.out.println(newR);
        }
    }

    static class Time {
        static public void timenew(int t) {
            int h = t / 3600;
            int m = (t % 3600) / 60;
            int s = (t % 3600) % 60;
            System.out.println(t + " секунд = " + h + " часов " + m + " минут " + s + " секунд.");
        }
    }

    static class Point {
        static public void poi(int x, int y) {
            boolean c1 = y >= -3 && y <= 0 && x >= -4 && x <= 4;
            boolean c2 = y >= 0 && y <= 4 & x >= -2 && x <= 2;
            System.out.println(c1 || c2);
        }
    }

    public static void main(String[] args) {
        Arithmetic.arith(20, 7, 14);
        Fractions.fract(7, 9, 5);
        Trigonometry.trig(60, 45);
        Replacement.repl(555.333);
        Time.timenew(726865);
        Point.poi(2, 1);
    }
}
