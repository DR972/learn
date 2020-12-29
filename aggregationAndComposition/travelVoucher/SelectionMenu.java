package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.Scanner;

public class SelectionMenu {
    private static int selectionLevel = 0;

    public static void select() {
        System.out.println("\nПривет, дружище! Я уже вам завидую , отдыхать это классно. Как будем выбирать?");
        Scanner in = new Scanner(System.in);
        int choice;
        int exit = 0;
        for (; ; ) {
            do {
                System.out.println("Выберите цифру от 1 до 5, 0 - возврат в предыдущее меню.");
                showMenu(exit++);
                while (!in.hasNextInt()) {
                    System.out.println("Промазал! Это вообще не цифра.");
                    in.next();
                }
                choice = in.nextInt();
            } while (!isvalid(choice));
            switch (selectionLevel) {
                case 0: selectOn(choice);
                    break;
                case 1: selectByTypeOfTravel(choice);
                    break;
                case 2: selectByTypeOfTransport(choice);
                    break;
                case 3: selectByTypeOfFood(choice);
                    break;
                case 4: selectByNumberOfDays(choice);
                    break;
                case 5: selectByPrice(choice);
                    break;
            }
            if (choice == 0 && selectionLevel == 0) {
                System.out.println("\nНадеюсь вы нашли, что хотели.");
                break;
            }
            if (choice == 0) {
                selectionLevel = 0;
                showMenu(0);
            }
        }
    }

    static void showMenu(int exit) {
        if (exit == 0) {
            System.out.println("1. по типу путешествия (море и пляж, экскурсии, лечение, шоппинг, круиз);\n" +
                    "2. по типу транспорта (самолет, автобус, поезд, пароход);\n3. по типу питания (ну, сам знаешь);\n" +
                    "4. по количеству дней;\n5. по цене.");
        }
    }

    static boolean isvalid(int ch) {
        return !(ch < 0 || ch > 5);
    }

    static void selectOn(int choice) {
        switch (choice) {
            case 1:
                System.out.println("1. море и пляж;\n2. экскурсии;\n3. лечение;\n4. шоппинг;\n5. круиз.");
                selectionLevel = 1;
                return;
            case 2:
                System.out.println("1. самолет;\n2. автобус;\n3. поезд;\n4. пароход;\n5. самостоятельно.");
                selectionLevel = 2;
                return;
            case 3:
                System.out.println("1. все включено;\n2. полный пансион;\n3. завтрак и ужин;\n4. завтрак;\n5. без питания.");
                selectionLevel = 3;
                return;
            case 4:
                System.out.println("1. до 5 дней;\n2. 5 - 10 дней;\n3. 10 - 15 дней;\n4. 15 - 20 дней;\n5. более 20 дней.");
                selectionLevel = 4;
                return;
            case 5:
                System.out.println("1. до 500;\n2. 500 - 1000;\n3. 1000 - 1500;\n4. 1500 - 2000;\n5. больше 2000.");
                selectionLevel = 5;
        }
    }

    static void selectByTypeOfTravel(int choice) {
        switch (choice) {
            case 1: Main.findSortByTypeOfTravel(TypeOfTravel.RECREATION);
                break;
            case 2: Main.findSortByTypeOfTravel(TypeOfTravel.EXCURSION);
                break;
            case 3: Main.findSortByTypeOfTravel(TypeOfTravel.TREATMENT);
                break;
            case 4: Main.findSortByTypeOfTravel(TypeOfTravel.SHOPPING);
                break;
            case 5: Main.findSortByTypeOfTravel(TypeOfTravel.CRUISE);
                break;
        }
    }

    static void selectByTypeOfTransport(int choice) {
        switch (choice) {
            case 1: Main.findSortByTypeOfTransport(TypeOfTransport.PLANE);
                break;
            case 2: Main.findSortByTypeOfTransport(TypeOfTransport.BUS);
                break;
            case 3: Main.findSortByTypeOfTransport(TypeOfTransport.TRAIN);
                break;
            case 4: Main.findSortByTypeOfTransport(TypeOfTransport.SHIP);
                break;
            case 5: Main.findSortByTypeOfTransport(TypeOfTransport.WITHOUT_TRANSPORT);
                break;
        }
    }

    static void selectByTypeOfFood(int choice) {
        switch (choice) {
            case 1: Main.findSortByTypeOfFood(TypeOfFood.ALL_INCLUSIVE);
                break;
            case 2: Main.findSortByTypeOfFood(TypeOfFood.FULL_BOARD);
                break;
            case 3: Main.findSortByTypeOfFood(TypeOfFood.HALF_BOARD);
                break;
            case 4: Main.findSortByTypeOfFood(TypeOfFood.BREAKFAST);
                break;
            case 5: Main.findSortByTypeOfFood(TypeOfFood.WITHOUT_FOOD);
                break;
        }
    }

    static void selectByNumberOfDays(int choice) {
        switch (choice) {
            case 1: Main.findSortByNumberOfDays(0, 5);
                break;
            case 2: Main.findSortByNumberOfDays(5, 10);
                break;
            case 3: Main.findSortByNumberOfDays(10, 15);
                break;
            case 4: Main.findSortByNumberOfDays(15, 20);
                break;
            case 5: Main.findSortByNumberOfDays(20, 100);
                break;
        }
    }

    static void selectByPrice(int choice) {
        switch (choice) {
            case 1: Main.findSortByPrice(0, 500);
                break;
            case 2: Main.findSortByPrice(500, 1000);
                break;
            case 3: Main.findSortByPrice(1000, 1500);
                break;
            case 4: Main.findSortByPrice(1500, 2000);
                break;
            case 5: Main.findSortByPrice(2000, 1000000);
                break;
        }
    }
}
