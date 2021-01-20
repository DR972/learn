package by.epam.learn.main;

public class CharacterCodes {
    public static void codes() {
        System.out.println("Задание 5.");
        for (int i=33; i <= 126; i++) {
            System.out.println("Код символа: " + (char) i + " " + i);
        }
    }
}
