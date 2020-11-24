package by.epam.learn.main;

public class SumOfSquares {
    public static void square() {
        System.out.println("Задание 3.");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Сумма квадратов первых ста чисел: " + sum);
    }
}
