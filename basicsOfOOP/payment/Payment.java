package by.epam.learn.main.modul5.payment;

import java.util.*;

public class Payment {
    private final ArrayList<Product> products;

    public Payment(ArrayList<Product> products) {
        this.products = products;
    }

    void addProduct(long barcode, String name, double price, int quantity) {
        products.add(new Product(barcode, name, price, quantity));
    }

    Set<Product> generatePurchase(List<Product> products) {
        Set<Product> unique = new HashSet<>(products);
        for (Product key : unique) {
            key.quantity = Collections.frequency(products, key);
        }
        return unique;
    }

    String checkCalculation(Set<Product> products) {
        double sum = 0;
        int number = 0;
        StringBuilder check = new StringBuilder("\nЧек.\n");
        for (Product product : products) {
            number += product.quantity;
            sum += product.quantity * product.price;
            check.append(String.format("%-15s %-14s %-6d %-8.2f %-6.2f\n", product.barcode, product.name, product.quantity,
                    product.price, product.quantity * product.price));
        }
        check.append(String.format("Всего товаров: %-2s на сумму: %-2.2f \nСпасибо за покупку.", number, sum));
        return check.toString();
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return String.format("\n%-15s %-14s %-8s %s", "Штрихкод", "Наименование", "Цена", "Остаток")
                + getProducts().toString();
    }

    static class Product {
        long barcode;
        String name;
        double price;
        int quantity;

        public Product(long barcode, String name, double price, int quantity) {
            this.barcode = barcode;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public long getBarcode() {
            return barcode;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return (String.format("\n%-15s %-14s %-8s %s", getBarcode(), getName(), getPrice(), getQuantity()));
        }
    }
}


