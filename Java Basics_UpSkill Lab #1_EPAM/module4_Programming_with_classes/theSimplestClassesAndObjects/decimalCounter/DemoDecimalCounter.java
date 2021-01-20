package by.epam.learn.main.modul3.simpleClasess;

/**
 * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
 * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
 * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
 * получить его текущее состояние. Написать код, демонстрирующий все возможности класса.
 */

public class DemoDecimalCounter {

    public static void main(String[] args) {
        DecimalCounter first = new DecimalCounter(1, 10, 3);

        int min = (int) (Math.random() * 10);
        int max = (int) (Math.random() * 10);
        int current = (int) (Math.random() * 10);
        DecimalCounter second = new DecimalCounter(min, max, current);

        System.out.println("a: " + first.getCurrentValue());
        System.out.println("b: " + second.getCurrentValue());
        System.out.println("----------------------");

        for (int i = 0; i < 3; ++i) {
            first.increase();
            second.increase();
        }
        System.out.println("a: " + first.getCurrentValue());
        System.out.println("b: " + second.getCurrentValue());
        System.out.println("----------------------");

        for (int i = 0; i < 7; ++i) {
            first.decrease();
            second.decrease();
        }
        System.out.println("a: " + first.getCurrentValue());
        System.out.println("b: " + second.getCurrentValue());
        System.out.println("----------------------");
    }
}
