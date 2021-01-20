package by.epam.learn.main.modul3.simpleClasess;

/**
 * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод  toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
 * Найти и вывести:
 * a) список покупателей в алфавитном порядке;
 * b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.
 */

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        CustomerAggregation aggregation = new CustomerAggregation("market", new ArrayList<>());

        aggregation.addCustomer("Иванов", "Иван", "Иванович", "Минск",
                new BigInteger("1111111111111111"), 12345678);
        aggregation.addCustomer("Петров", "Сергей", "Петрович", "Могилев",
                new BigInteger("2222222222222222"), 25468732);
        aggregation.addCustomer("Сергеев", "Петр", "Сергеевич", "Витебск",
                new BigInteger("3333333333333333"), 35461287);
        aggregation.addCustomer("Розмысл", "Дмитрий", "Владимирович", "Гродно",
                new BigInteger("7777777777777777"), 94621587);
        aggregation.addCustomer("Янкович", "Ян", "Янович", "Брест",
                new BigInteger("4444444444444444"), 35612469);
        aggregation.addCustomer("Тереньтьев", "Терентий", "Иванович", "Гомель",
                new BigInteger("5555555555555555"), 56043281);

        System.out.println("Список покупателей в алфавитном порядке:");
        aggregation.sortName();
        System.out.printf("\n%-4s%-12s%-12s%-15s%-14s%-17s%s%n",
                "id","lastName", "firstName","patronymic","address","cardNumber","bankAccount");
        System.out.println("-------------------------------------------------------------------------------------");
        for (int i = 0; i < aggregation.getBase().size(); i++) {
            System.out.println(aggregation.getBase().get(i));
        }
        System.out.println("-------------------------------------------------------------------------------------");

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        System.out.printf("\n%-4s%-12s%-12s%-15s%-14s%-17s%s%n",
                "id","lastName", "firstName","patronymic","address","cardNumber","bankAccount");
        System.out.println("-------------------------------------------------------------------------------------");
        ArrayList<Customer> list = aggregation.sortCard("2000000000000000", "5000000000000000");
        list.sort(Comparator.comparing(Customer::getCardNumber));
        if (list.size() == 0) {
            System.out.println("Банковские карты не найдены.");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
