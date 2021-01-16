package by.epam.learn.main.modul5.payment;

import java.util.*;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно
 * сформировать покупку из нескольких товаров.
 */

public class Main {
    static Payment payment = new Payment(new ArrayList<>());

    public static void main(String[] args) {

        payment.addProduct(9746982190123L, "Багет", 1.39, 40);
        payment.addProduct(1234567890123L, "Молоко", 1.85, 50);
        payment.addProduct(3237834578903L, "Шпроты", 2.99, 10);
        payment.addProduct(1448138890123L, "Хлеб", 1.62, 50);
        payment.addProduct(1256784386923L, "Сок", 2.95, 30);
        payment.addProduct(1243953674293L, "Йогурт", 0.84, 80);
        payment.addProduct(4692387890123L, "Колбаса", 23.76, 10);
        payment.addProduct(1234569536471L, "Мороженное", 3.78, 30);
        payment.addProduct(1365217890123L, "Кофе", 64.89, 5);
        payment.addProduct(1234568963478L, "Сахар", 1.72, 5);
        payment.addProduct(3568749890123L, "Чай", 4.52, 10);
        System.out.println("Все товары магазмна:" + payment);
        System.out.println(payment.checkCalculation(payment.generatePurchase(randomBuyer())));
    }

    private static ArrayList<Payment.Product> randomBuyer() {
        ArrayList<Payment.Product> products = new ArrayList<>();
        int numberOfProducts = (int) (Math.random() * 11 + 1);
        for (int i = 0; i < numberOfProducts; i++) {
            int randomProduct = (int) (Math.random() * 11);
            products.add(payment.getProducts().get(randomProduct));
        }
        return products;
    }
}
