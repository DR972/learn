package by.epam.learn.main.modul5.createGifts.constituentElements;

import java.util.ArrayList;

public class Gift {
    private Box box;
    private Chocolate chocolate;
    private ArrayList<Candy> candies;
    private int weight;
    private double price;

    public Gift() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public void setCandies(ArrayList<Candy> candies) {
        this.candies = candies;
    }

    public ArrayList<Candy> getCandies() {
        return candies;
    }

    @Override
    public String toString() {
        StringBuilder candyString = new StringBuilder();
        getCandies().forEach(candy -> candyString.append(candy).append(",\n"));
        return String.format("\nYour gift:\npackaging: %s,\nchocolate: %s,\ncandies:\n%sGift weight %d " +
                "g.\nGift price %.2f rubles.", box, chocolate, candyString.toString(), weight, price);
    }
}