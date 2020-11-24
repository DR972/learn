package by.epam.learn.main;

import java.util.Scanner;

class Function {
    String f;

    public Function() {
        System.out.println("\nЗадание 5.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число x: ");
        double x = scan.nextDouble();
        double y;
        if (x <= 3) {
            y = x * x - 3 * x + 9;
        } else y = 1 / (Math.pow(x, 3) + 6);
        f = "Значение функции: " + y;
    }
}
