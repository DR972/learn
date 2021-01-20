package by.epam.learn.main;

import java.util.Scanner;

public class Function {
    public static void fun() {
        System.out.println("Задание 2.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        System.out.println("Введите число h: ");
        int h = in.nextInt();
        for (int i = a; i <= b; i += h) {
            if (i <= 2) {
                System.out.println("при x=" + i + " y=" + (-i));
            }
            if (i > 2) {
                System.out.println("при x=" + i + " y=" + i);
            }
        }
    }
}
