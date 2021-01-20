package by.epam.learn.main.modul5.payment;

import java.util.*;

public class Shop {
    private final ArrayList<Payment.Product> products;

    public Shop(ArrayList<Payment.Product> products) {
        this.products = products;
    }

    void addProduct(long barcode, String name, double price, int quantity) {
        products.add(new Payment.Product(barcode, name, price, quantity));
    }

    Set<Payment.Product> generatePurchase(List<Payment.Product> products) {
        Set<Payment.Product> unique = new HashSet<>(products);
        for (Payment.Product key : unique) {
            key.quantity = Collections.frequency(products, key);
        }
        return unique;
    }

    public ArrayList<Payment.Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder productString = new StringBuilder();
        getProducts().forEach(product -> productString.append(product).append(","));
        return String.format("\n%-15s %-14s %-8s %s", "Штрихкод", "Наименование", "Цена", "Остаток")
                + productString;
    }
}
