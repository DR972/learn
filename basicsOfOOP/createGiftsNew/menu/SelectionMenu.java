package by.epam.learn.main.modul5.createGiftsNew.menu;

import by.epam.learn.main.modul5.createGiftsNew.factory.Director;
import by.epam.learn.main.modul5.createGiftsNew.factory.GiftBuilder;
import by.epam.learn.main.modul5.createGiftsNew.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SelectionMenu {
    private static final Customer customer = new Customer();
    private static int residualCapacity;

    public void letsGo() {
        Director director = new Director();
        director.setBuilder(new GiftBuilder());
        customer.setGift(director.buildGift());
        residualCapacity = customer.getGift().getBox().getWeight() - customer.getGift().getWeight();
        System.out.println(customer.getGift());
        customer.setGift(director.complementGift());
        System.out.println(customer.getGift());
        System.out.println("Thank you for your purchase. Have a nice day.");
    }

    private static int select(int numberOfItems) {
        System.out.println("\nPlease enter a number from 1 to " + numberOfItems + ":");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("[1-" + numberOfItems + "]");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Invalid input. Please enter a number from 1 to " + numberOfItems + ":");
        }
        return scanner.nextInt();
    }

    public static Box selectBox() {
        System.out.println("\nLet's start with packaging:");
        Arrays.asList(Box.values()).forEach(box -> System.out.println((box.ordinal() + 1) + ". " + box + ". "));
        return Box.byOrdinal(select(Box.values().length));
    }

    public static Chocolate selectChocolate() {
        System.out.println("\nSelect chocolate bars:");
        Arrays.asList(Chocolate.values()).forEach(ch -> System.out.println((ch.ordinal() + 1) + ". " + ch + ". "));
        return Chocolate.byOrdinal(select(Chocolate.values().length));
    }

    public static ArrayList<Candy> addCandy(ArrayList<Candy> candies) {
        System.out.println("Now add 50 g of each type of candy.");
        candies.addAll(Arrays.asList(Candy.values()));
        return candies;
    }

    public static ArrayList<Candy> addCandyByCustomer(ArrayList<Candy> candies) {
        while (residualCapacity >= 50) {
            System.out.println("You can also add " + residualCapacity + " g to this box.");
            System.out.println("\nWhat will we do next?\n" +
                    "1. All right. I like the gift.\n" +
                    "2. Add the candies yourself.\n" +
                    "3. I myself want to complement the gift.");
            switch (select(3)) {
                case 1:
                    return candies;
                case 2:
                    addCandiesByYourself(candies);
                    break;
                case 3:
                    selectCandy(candies);
                    break;
            }
        }
        return candies;
    }

    private static ArrayList<Candy> selectCandy(ArrayList<Candy> candies) {
        System.out.println("\nChoosing a candies:");
        Arrays.asList(Candy.values()).forEach(candy -> System.out.print((candy.ordinal() + 1) + ". " + candy + ".\n"));
        int ordinal = select(Candy.values().length);
        addTheSelectedCandy(ordinal, candies);
        return candies;
    }

    private static ArrayList<Candy> addCandiesByYourself(ArrayList<Candy> candies) {
        if (residualCapacity >= 250) addAllCandies(candies);
        else addRandom(candies);
        return candies;
    }

    private static ArrayList<Candy> addAllCandies(ArrayList<Candy> candies) {
        candies.addAll(Arrays.asList(Candy.values()));
        double price = Arrays.stream(Candy.values()).mapToDouble(Candy::getPrice).sum();
        int weight = Arrays.stream(Candy.values()).mapToInt(Candy::getWeight).sum();
        customer.getGift().setWeight(customer.getGift().getWeight() + weight);
        residualCapacity -= weight;
        customer.getGift().setPrice(customer.getGift().getPrice() + price);
        addCandiesByYourself(candies);
        return candies;
    }

    private static ArrayList<Candy> addRandom(ArrayList<Candy> candies) {
        while (residualCapacity >= 50) {
            int ordinal = (int) (Math.random() * 5 + 1);
            addTheSelectedCandy(ordinal, candies);
        }
        return candies;
    }

    private static ArrayList<Candy> addTheSelectedCandy(int ordinal, ArrayList<Candy> candies) {
        candies.add(Candy.byOrdinal(ordinal));
        customer.getGift().setWeight(customer.getGift().getWeight() + Candy.byOrdinal(ordinal).getWeight());
        customer.getGift().setPrice(customer.getGift().getPrice() + Candy.byOrdinal(ordinal).getPrice());
        residualCapacity -= Candy.byOrdinal(ordinal).getWeight();
        return candies;
    }
}