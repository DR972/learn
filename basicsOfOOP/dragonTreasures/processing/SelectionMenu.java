package by.epam.learn.main.modul5.dragonTreasures.processing;

import java.util.Scanner;

public class SelectionMenu {

    public static void printMenu(int amount) {
        String menuText = "\nAvailable operations:\n" +
                "1. Look all treasures;\n" +
                "2. Select the most expensive treasure;\n" +
                "3. Select treasures for a given amount;\n" +
                "0. Exit the cave.";
        System.out.println(menuText);
        select(amount);
    }

    public static void select(int amount) {
        Scanner in = new Scanner(System.in);
        DataProcessing dataProcessing = new DataProcessing(FillingTheCave.fillCaveWithTreasures(), amount);
        int choice;
        for (; ; ) {
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
                    dataProcessing.printAllTreasures();
                    break;
                case 2:
                    dataProcessing.chooseTheMostExpensiveTreasure();
                    break;
                case 3:
                    dataProcessing.chooseTreasureForGivenAmount();
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
