package by.epam.learn.main.modul5.createGifts.menu;

import by.epam.learn.main.modul5.createGifts.model.*;
import by.epam.learn.main.modul5.createGifts.factory.GiftBuilder;
import by.epam.learn.main.modul5.createGifts.factory.Director;

import java.util.*;
import java.util.regex.Pattern;

public class SelectionMenu {
    private static final Customer customer = new Customer();
    private static final ArrayList<Candy> candies = new ArrayList<>();
    private static int residualCapacity;

    public void letsGo() {
        Director director = new Director();
        director.setBuilder(new GiftBuilder());
        customer.setGift(director.buildGift());
        residualCapacity = customer.getGift().getBox().getWeight() - customer.getGift().getWeight();
        System.out.println(customer.getGift());
        addCandyByCustomer();
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

    public static ArrayList<Candy> addCandy() {
        System.out.println("Now add 50 g of each type of candy.");
        candies.addAll(Arrays.asList(Candy.values()));
        return candies;
    }

    private static void addCandyByCustomer() {
        while (residualCapacity >= 50) {
            System.out.println("You can also add " + residualCapacity + " g to this box.");
            System.out.println("\nWhat will we do next?\n" +
                    "1. All right. I like the gift.\n" +
                    "2. Add the candies yourself.\n" +
                    "3. I myself want to complement the gift.");
            switch (select(3)) {
                case 1:
                    return;
                case 2:
                    addCandiesByYourself();
                    break;
                case 3:
                    selectCandy();
                    break;
            }
        }
    }

    private static void selectCandy() {
        System.out.println("\nChoosing a candies:");
        Arrays.asList(Candy.values()).forEach(candy -> System.out.print((candy.ordinal() + 1) + ". " + candy + ".\n"));
        int ordinal = select(Candy.values().length);
        addTheSelectedCandy(ordinal);
    }

    private static void addCandiesByYourself() {
        if (residualCapacity >= 250) addAllCandies();
        else addRandom();
    }

    private static void addAllCandies() {
        candies.addAll(Arrays.asList(Candy.values()));
        double price = Arrays.stream(Candy.values()).mapToDouble(Candy::getPrice).sum();
        int weight = Arrays.stream(Candy.values()).mapToInt(Candy::getWeight).sum();
        customer.getGift().setWeight(customer.getGift().getWeight() + weight);
        residualCapacity -= weight;
        customer.getGift().setPrice(customer.getGift().getPrice() + price);
        addCandiesByYourself();
    }

    private static void addRandom() {
        while (residualCapacity >= 50) {
            int ordinal = (int) (Math.random() * 5 + 1);
            addTheSelectedCandy(ordinal);
        }
    }

    private static void addTheSelectedCandy(int ordinal) {
        candies.add(Candy.byOrdinal(ordinal));
        customer.getGift().setWeight(customer.getGift().getWeight() + Candy.byOrdinal(ordinal).getWeight());
        customer.getGift().setPrice(customer.getGift().getPrice() + Candy.byOrdinal(ordinal).getPrice());
        residualCapacity -= Candy.byOrdinal(ordinal).getWeight();
    }
}