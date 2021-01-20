package by.epam.learn.main;

import java.math.BigInteger;

public class ProduktOfSquares {
    public static void squares() {
        System.out.println("Задание 4.");
        BigInteger s = BigInteger.valueOf(1);
        for (int i = 2; i <= 200; i++) {
            s = s.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Произведение квадратов первых двухсот чисел: " + s);
    }
}
