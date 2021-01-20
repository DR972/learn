package by.epam.learn.main;

import java.util.Scanner;

public class Input {
    public static void inp() {
        int sum = 0;
        System.out.println("Задание 1.\nВведите любое целое положительное число.");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Сумма всех целых чисел от 1 до " + num + " включительно: " + sum);
    }
}
