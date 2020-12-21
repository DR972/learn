package by.epam.learn.main.modul3.simpleClasess;

public class DemoDecimalCounter {

    public static void main(String[] args) {
        DecimalCounter first = new DecimalCounter(1, 10, 3);

        int min = (int) (Math.random() * 10);
        int max = (int) (Math.random() * 10);
        int current = (int) (Math.random() * 10);
        DecimalCounter second = new DecimalCounter(min, max, current);

        System.out.println("a: " + first.have());
        System.out.println("b: " + second.have());
        System.out.println("----------------------");

        for (int i = 0; i < 3; ++i) {
            first.increase();
            second.increase();
        }
        System.out.println("a: " + first.have());
        System.out.println("b: " + second.have());
        System.out.println("----------------------");

        for (int i = 0; i < 7; ++i) {
            first.decrease();
            second.decrease();
        }
        System.out.println("a: " + first.have());
        System.out.println("b: " + second.have());
        System.out.println("----------------------");
    }
}
