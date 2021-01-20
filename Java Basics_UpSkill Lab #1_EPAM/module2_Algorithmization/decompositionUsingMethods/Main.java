package by.epam.learn.main;

import java.util.Scanner;

/**
 * 1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 *      натуральных чисел:
 *          НОК(А,В) = А*В / НОД(А,В)
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 * 3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.
 * 4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар
 *      точек самое большое расстояние. Указание. Координаты точек занести в массив.
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
 *      которое меньше максимального элемента массива, но больше всех других элементов).
 * 6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 * 7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 * 8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 *      Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
 *      массива с номерами от k до m.
 * 9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
 *      если угол между сторонами длиной X и Y— прямой.
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются
 *      цифры числа N.
 * 11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 * 12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого являются
 *      числа, сумма цифр которых равна К и которые не большее N.
 * 13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 *      Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
 *      Для решения задачи использовать декомпозицию.
 * 14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
 *      возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
 *      использовать декомпозицию.
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
 *      (например, 1234, 5789). Для решения задачи использовать декомпозицию.
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
 *      Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 * 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
 *      Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        Choice theTask = new Choice();
        int o = 0;
        for (; ; ) {
            do {
                theTask.showMenu(o++);
                while (!in.hasNextInt()) {
                    System.out.println("Это не номер!");
                    in.next();
                }
                choice = in.nextInt();
            } while (!theTask.isvalid(choice));
            if (choice == 0) {
                System.out.println("\nНу как? Жду рекомендаций.");
                break;
            }
            theTask.choiceOn(choice);
        }
    }

    private static int naturalNumber(int v) {
        Scanner in = new Scanner(System.in);
        int k;
        do {
            System.out.println("Введите натуральное число:");
            while (!in.hasNextInt()) {
                System.out.println("Это не натуральное число! Пробуем дальше:");
                in.next();
            }
            k = in.nextInt();
        } while (k <= v);
        return k;
    }

    private static int[][] theMatrix(int n) {
        System.out.println("\n Есть точки c координатами");
        int[][] matrix = new int[n][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * n * 6 - 3 * n);
            }
            System.out.print("(" + matrix[i][0] + "," + matrix[i][1] + ")\t");
        }
        return matrix;
    }

    private static int[] array(int n) {
        int[] array = new int[n];
        System.out.println("Есть массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n * 3);
            System.out.print(array[i] + "\t");
        }
        return array;
    }

    static void resultGcdAndLcm() {
        System.out.println("\nЗадание 1.");
        int a = naturalNumber(0);
        int b = naturalNumber(0);
        GcdAndLcm gcdAndLcm = new GcdAndLcm();
        System.out.println("НОД " + a + " и " + b + ":\t" + gcdAndLcm.gcd(a, b));
        System.out.println("НОК " + a + " и " + b + ":\t" + gcdAndLcm.lcm(a, b));
    }

    static void resultGcdOf4Numbers() {
        System.out.println("\nЗадание 2.");
        int a = naturalNumber(0);
        int b = naturalNumber(0);
        int c = naturalNumber(0);
        int d = naturalNumber(0);
        GcdOf4Numbers gcdOf4Numbers = new GcdOf4Numbers(a, b, c, d);
        System.out.println("НОД " + a + ", " + b + ", " + c + ", " + d + ":\t" + gcdOf4Numbers.gcdOf4Numbers());
    }

    static void resultAreaOfRegularHexagon() {
        System.out.println("\nЗадание 3.");
        int a = naturalNumber(0);
        AreaOfRegularHexagon areaOfRegularHexagon = new AreaOfRegularHexagon(a);
        System.out.println("Площадь равностороннего шестиугольника со стороной " + a
                + " равна:\t" + areaOfRegularHexagon.areaHexagon());
    }

    static void resultDistanceBetweenPoints() {
        System.out.println("\nЗадание 4. Вначале зададим количество точек.");
        int n = naturalNumber(0);
        int[][] point = theMatrix(n);
        DistanceBetweenPoints distanceBetweenPoints = new DistanceBetweenPoints(point);
        System.out.println("\nСамое большое расстояние: " + distanceBetweenPoints.maxDistance());
        System.out.println("между точками (" + point[distanceBetweenPoints.point1()][0] + "," +
                point[distanceBetweenPoints.point1()][1] + ") и (" + point[distanceBetweenPoints.point2()][0] + "," +
                point[distanceBetweenPoints.point2()][1] + ").");
    }

    static void resultAlmostMaximum() {
        System.out.println("\nЗадание 5. Вначале зададим размер массива.");
        int n = naturalNumber(0);
        int[] array = array(n);
        AlmostMaximum almostMaximum = new AlmostMaximum(array);
        System.out.println("\nВторой по величине элемент в массиве равен: " + almostMaximum.almostMax());
    }

    static void resultCoprimeNumbers() {
        System.out.println("\nЗадание 6. Вначале введем 3 натуральных числа:");
        int a = naturalNumber(0);
        int b = naturalNumber(0);
        int c = naturalNumber(0);
        CoprimeNumbers coprimeNumbers = new CoprimeNumbers(a, b, c);
        if (coprimeNumbers.coprime()) {
            System.out.println("Эти числа являются взаимно простыми.");
        } else System.out.println("Эти числа не являются взаимно простыми.");
    }

    static void resultTheSumOfFactorials() {
        System.out.println("\nЗадание 7. Найдем сумму факториалов от k=1 до m=9 с шагом 2.");
        int k = 1;
        int m = 9;
        int step = 2;
        TheSumOfFactorials theSumOfFactorials = new TheSumOfFactorials(k, m, step);
        System.out.println(theSumOfFactorials.sumFactorial());
    }

    static void enterNumber() {
        System.out.println("\nЗадание 8. Введите через Enter n (размер массива), k, и m.");
        int n, m, k;
        do {
            System.out.println("Не забудьте, что 0<k+3<=m, n>=m.");
            n = naturalNumber(0);
            k = naturalNumber(0);
            m = naturalNumber(0);
        } while (m < (k + 3) || n < m);
        resultSumOf3ArrayElements(n, k, m);
    }

    static void resultSumOf3ArrayElements(int n, int k, int m) {
        int[] array = array(n);
        SumOf3ArrayElements sumOf3ArrayElements = new SumOf3ArrayElements(array, k, m);
        int[] sum3 = sumOf3ArrayElements.sum3Elements();
        System.out.println("\nСуммы суммы трех последовательно расположенных элементов массива с номерами от k до m:");
        for (int j : sum3) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }

    static void resultAreaOfQuadrangle() {
        System.out.println("\nЗадание 9. Введите через Enter стороны четырехугольника X, Y, Z, T.");
        int x = naturalNumber(0);
        int y = naturalNumber(0);
        int z = naturalNumber(0);
        int t = naturalNumber(0);
        AreaOfQuadrangle areaOfQuadrangle = new AreaOfQuadrangle(x, y, z, t);
        if (areaOfQuadrangle.existence()) {
            System.out.println("Такого четырехугольника не существует.");
        } else {
            System.out.println("Площадь выпуклового четырехугольника: " + areaOfQuadrangle.convex());
            if (areaOfQuadrangle.concave() == 0) {
                System.out.println("Вогнутого четырехугольника не существует.");
            } else System.out.println("Площадь вогнутого четырехугольника: " + areaOfQuadrangle.concave());
        }
    }

    static void resultDigitsNumbers() {
        System.out.println("\nЗадание 10.");
        int n = naturalNumber(0);
        DigitsNumbers digitsNumbers = new DigitsNumbers(n);
        System.out.println("\nВ результате получаем массив:");
        int[] elements = digitsNumbers.elements();
        for (int element : elements) {
            System.out.print(element + "\t");
        }
    }

    static void resultMoreNumeral() {
        System.out.println("\nЗадание 11.");
        int n = naturalNumber(0);
        int m = naturalNumber(0);
        MoreNumeral moreNumeral = new MoreNumeral(n, m);
        if (moreNumeral.more() == 0) {
            System.out.println("Количество цифр у этих чисел совпадает.");
        } else System.out.println("B числе " + moreNumeral.more() + " цифр больше.");
    }

    static void resultArrayOfKandN() {
        System.out.println("\nЗадание 12.");
        int k = naturalNumber(1);
        int n = naturalNumber(2);
        ArrayOfKandN arrayOfKandN = new ArrayOfKandN(k, n);
        int[] a = arrayOfKandN.a();
        for (int j : a) {
            System.out.print(j + "\t");
        }
    }

    static void resultTwinsNumbers() {
        System.out.println("\nЗадание 13.");
        int n = naturalNumber(2);
        TwinsNumbers twinsNumbers = new TwinsNumbers(n);
        System.out.println();
        System.out.println("В этом промежутке встречаются такие \"близнецы\":\n" + twinsNumbers.twins());
    }

    static void resultArmstrongNumber() {
        System.out.println("\nЗадание 14.");
        int k = naturalNumber(0);
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(k);
        System.out.println("Числа Армстронга:\n" + armstrongNumber.armstrongNumber());
    }

    static void resultIncreasingSequence() {
        System.out.println("\nЗадание 15.");
        int n = naturalNumber(2);
        IncreasingSequence increasingSequence = new IncreasingSequence(n);
        System.out.print("Существуют такие возрастающие последовательноси:\n" + increasingSequence.increase());
    }

    static void resultSumOfNumbers() {
        System.out.println("\nЗадание 16.");
        int n = naturalNumber(0);
        SumOfNumbers sumOfNumbers = new SumOfNumbers(n);
        System.out.println("Сумма чисел, содержащих только нечетные цифры равна:\t" + sumOfNumbers.sum());
        System.out.println("В этой сумме количество четных цифр равно:\t" + sumOfNumbers.evenDigits());
    }

    static void resultNumberMinusDigits() {
        System.out.println("\nЗадание 17.");
        int n = naturalNumber(0);
        NumberMinusDigits numberMinusDigits = new NumberMinusDigits(n);
        System.out.println("Надо провести " + numberMinusDigits.subtraction() + " действий.");
    }
}
