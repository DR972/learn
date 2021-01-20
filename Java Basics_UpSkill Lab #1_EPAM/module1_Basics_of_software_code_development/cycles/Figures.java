package by.epam.learn.main;

import java.util.Scanner;

public class Figures {
    public static void figur () {
        System.out.println("Задание 7.");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число а: ");
        int a = in.nextInt();
        System.out.println("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Цифры, которые входят и в число а, и число b:\t");
        int[] arr = new int[10];
        while(a != 0) {
            arr[a % 10]++;
            a /= 10;
        }
        while(b != 0) {
            if(arr[b % 10] != 0)
                System.out.print(b % 10 + "\t");
            b /= 10;
        }
    }
}
