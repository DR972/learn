package by.epam.learn.main;

import java.util.Scanner;

public class Dividers {
    public static void divid() {
        System.out.println("Задание 6. \nВведите два любых натуральных числа:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int m = Math.min(x, y);
        int n = Math.max(x, y);
        for (int i = m; i <= n; i++) {
            int k = 0;
            for (int j = 2; j <= i/2; j++) {
                if ((i % j) == 0) {
                    if (k == 0) {
                        System.out.print("Делители числа " + i + ": ");
                        k++;
                    }
                    System.out.print(j + " ");
                }
            }
            if (k > 0) {
                System.out.println();
            }
        }
    }
}
