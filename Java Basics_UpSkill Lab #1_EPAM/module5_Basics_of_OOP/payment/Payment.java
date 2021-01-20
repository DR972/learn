package by.epam.learn.main.modul5.payment;

import java.util.*;

public class Payment extends Shop{

    public Payment(ArrayList<Product> products) {
        super(products);
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


