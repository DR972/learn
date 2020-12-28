package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.Arrays;

public class TourPackage {
    private final String country;
    private final String city;
    private final TypeOfTravel[] type;
    private final TypeOfTransport transport;
    private final TypeOfFood food;
    private final int numberOfDays;
    private final int price;

    public TourPackage(String country, String city, TypeOfTravel[] type, TypeOfTransport transport,
                       TypeOfFood food, int numberOfDays, int price) {
        this.country = country;
        this.city = city;
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%-35s %-60s %-43s %-8s %-16s %-5d %d", country, city, Arrays.toString(type),
                transport, food, numberOfDays, price);
    }

    public TypeOfTravel[] getType() {
        return type;
    }

    public TypeOfTransport getTransport() {
        return transport;
    }

    public TypeOfFood getFood() {
        return food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public int getPrice() {
        return price;
    }

}