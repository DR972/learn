package by.epam.learn.main.modul3.simpleClasess;

/**
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее
 * значение из этих двух переменных.
 */

public class DoTest1 {

    public static void main(String[] args) {
        Test1 test1 = new Test1();

        test1.printTest();
        System.out.println("\nСуммма: " + test1.getSum());
        System.out.println("Максимум: " + test1.getMax());

        System.out.print("\nСмена переменных:");
        test1.setA(13);
        test1.setB(31);

        test1.printTest();
        System.out.println("\nСуммма: " + test1.getSum());
        System.out.println("Максимум: " + test1.getMax());
    }
}

