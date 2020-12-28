package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.Scanner;

public class SelectionMenu {
    private static int SELECTION_LEVEL = 1;
    private static TypeOfTravel TYPE_OF_TRAVEL;
    private static TypeOfTransport TYPE_OF_TRANSPORT;
    private static TypeOfFood TYPE_OF_FOOD;
    private static int MIN_DAYS;
    private static int MAX_DAYS;
    private static int MIN_PRICE;
    private static int MAX_PRICE;

    public static void select() {
        System.out.println("\nПривет, дружище! Я уже вам завидую , отдыхать это классно. Начнем с типа путешествия.");
        System.out.println("0. все варианты;\n1. море и пляж;\n2. экскурсии;\n3. лечение;\n4. шоппинг;\n5. круиз.");
        Scanner in = new Scanner(System.in);
        int choice;
        for (; ; ) {
            do {
                System.out.println("Выберите цифру от 0 до 5.");
                while (!in.hasNextInt()) {
                    System.out.println("Промазал! Это вообще не цифра.");
                    in.next();
                }
                choice = in.nextInt();
            } while (!isvalid(choice));
            switch (SELECTION_LEVEL) {
                case 1:
                    selectByTypeOfTravel(choice);
                    break;
                case 2:
                    selectByTypeOfTransport(choice);
                    break;
                case 3:
                    selectByTypeOfFood(choice);
                    break;
                case 4:
                    selectByNumberOfDays(choice);
                    break;
                case 5:
                    selectByPrice(choice);
                    break;
            }
            if (SELECTION_LEVEL > 5) {
                System.out.println("\nНадеюсь вы нашли, что хотели.");
                break;
            }
        }
    }

    static boolean isvalid(int ch) {
        return !(ch < 0 || ch > 5);
    }

    static void selectByTypeOfTravel(int choice) {
        switch (choice) {
            case 0:
                TYPE_OF_TRAVEL = null;
                break;
            case 1:
                TYPE_OF_TRAVEL = TypeOfTravel.RECREATION;
                break;
            case 2:
                TYPE_OF_TRAVEL = TypeOfTravel.EXCURSION;
                break;
            case 3:
                TYPE_OF_TRAVEL = TypeOfTravel.TREATMENT;
                break;
            case 4:
                TYPE_OF_TRAVEL = TypeOfTravel.SHOPPING;
                break;
            case 5:
                TYPE_OF_TRAVEL = TypeOfTravel.CRUISE;
                break;
        }
        SELECTION_LEVEL++;
        System.out.println("0. все варианты;\n1. самолет;\n2. автобус;\n3. поезд;\n4. пароход;\n5. самостоятельно.");
    }

    static void selectByTypeOfTransport(int choice) {
        switch (choice) {
            case 0:
                TYPE_OF_TRANSPORT = null;
                break;
            case 1:
                TYPE_OF_TRANSPORT = TypeOfTransport.PLANE;
                break;
            case 2:
                TYPE_OF_TRANSPORT = TypeOfTransport.BUS;
                break;
            case 3:
                TYPE_OF_TRANSPORT = TypeOfTransport.TRAIN;
                break;
            case 4:
                TYPE_OF_TRANSPORT = TypeOfTransport.SHIP;
                break;
            case 5:
                TYPE_OF_TRANSPORT = TypeOfTransport.WITHOUT_TRANSPORT;
                break;
        }
        SELECTION_LEVEL++;
        System.out.println("0. все варианты;\n1. все включено;\n2. полный пансион;\n3. завтрак и ужин;\n" +
                "4. завтрак;\n5. без питания.");
    }

    static void selectByTypeOfFood(int choice) {
        switch (choice) {
            case 0:
                TYPE_OF_FOOD = null;
                break;
            case 1:
                TYPE_OF_FOOD = TypeOfFood.ALL_INCLUSIVE;
                break;
            case 2:
                TYPE_OF_FOOD = TypeOfFood.FULL_BOARD;
                break;
            case 3:
                TYPE_OF_FOOD = TypeOfFood.HALF_BOARD;
                break;
            case 4:
                TYPE_OF_FOOD = TypeOfFood.BREAKFAST;
                break;
            case 5:
                TYPE_OF_FOOD = TypeOfFood.WITHOUT_FOOD;
                break;
        }
        System.out.println("0. все варианты;\n1. до 5 дней;\n2. 6 - 10 дней;\n3. 11 - 15 дней;\n4. 16 - 20 дней;" +
                "\n5. более 20 дней.");
        SELECTION_LEVEL++;
    }

    static void selectByNumberOfDays(int choice) {
        switch (choice) {
            case 0:
                MIN_DAYS = 0;
                MAX_DAYS = 100;
                break;
            case 1:
                MIN_DAYS = 0;
                MAX_DAYS = 5;
                break;
            case 2:
                MIN_DAYS = 5;
                MAX_DAYS = 10;
                break;
            case 3:
                MIN_DAYS = 10;
                MAX_DAYS = 15;
                break;
            case 4:
                MIN_DAYS = 15;
                MAX_DAYS = 20;
                break;
            case 5:
                MIN_DAYS = 20;
                MAX_DAYS = 100;
                break;
        }
        System.out.println("0. все варианты;\n1. до 500;\n2. 501 - 1000;\n3. 1001 - 1500;\n4. 1501 - 2000;" +
                "\n5. больше 2000.");
        SELECTION_LEVEL++;
    }

    static void selectByPrice(int choice) {
        switch (choice) {
            case 0:
                MIN_PRICE = 0;
                MAX_PRICE = 1000000;
                break;
            case 1:
                MIN_PRICE = 0;
                MAX_PRICE = 500;
                break;
            case 2:
                MIN_PRICE = 500;
                MAX_PRICE = 1000;
                break;
            case 3:
                MIN_PRICE = 1000;
                MAX_PRICE = 1500;
                break;
            case 4:
                MIN_PRICE = 1500;
                MAX_PRICE = 2000;
                break;
            case 5:
                MIN_PRICE = 2000;
                MAX_PRICE = 1000000;
                break;
        }
        SELECTION_LEVEL++;
        Main.findSort(TYPE_OF_TRAVEL, TYPE_OF_TRANSPORT, TYPE_OF_FOOD, MIN_DAYS, MAX_DAYS, MIN_PRICE, MAX_PRICE);
    }
}