package by.epam.learn.main.modul5.dragonTreasures.processing;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class SelectionMenu {

    public static void printMenu(int amount) throws FileNotFoundException {
        String menuText = "\nAvailable operations:\n" +
                "1. Look all treasures;\n" +
                "2. Select the most expensive treasure;\n" +
                "3. Select treasures for a given amount;\n" +
                "0. Exit the cave.";
        System.out.println(menuText);
        select(amount);
    }

    public static void select(int amount) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        Cave cave = new Cave(CaveFiller.fillCaveWithTreasures());
        int choice;
        while (true) {
            do {
                System.out.println("\nSelect a number from 0 to 3.");
                while (!in.hasNextInt()) {
                    System.out.println("Select a number from 0 to 3.");
                    in.next();
                }
                choice = in.nextInt();
            } while (!isvalid(choice));
            switch (choice) {
                case 1:
                    cave.printAllTreasures();
                    break;
                case 2:
                    cave.chooseTheMostExpensiveTreasure();
                    break;
                case 3:
                    cave.chooseTreasureForGivenAmount(amount);
                    break;
            }
            if (choice == 0) {
                System.out.println("\nI hope you found what you wanted.");
                break;
            }
        }
    }

    static boolean isvalid(int ch) {
        return !(ch < 0 || ch > 3);
    }
}
