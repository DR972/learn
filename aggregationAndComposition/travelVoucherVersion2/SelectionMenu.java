package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.Scanner;

public class SelectionMenu {
    private static int selectionLevel = 1;
    private static TypeOfTravel typeOfTravel;
    private static TypeOfTransport typeOfTransport;
    private static TypeOfFood typeOfFood;
    private static int minDays;
    private static int maxDays;
    private static int minPrice;
    private static int maxPrice;

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
            switch (selectionLevel) {
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
            if (selectionLevel > 5) {
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
                typeOfTravel = null;
                break;
            case 1:
                typeOfTravel = TypeOfTravel.RECREATION;
                break;
            case 2:
                typeOfTravel = TypeOfTravel.EXCURSION;
                break;
            case 3:
                typeOfTravel = TypeOfTravel.TREATMENT;
                break;
            case 4:
                typeOfTravel = TypeOfTravel.SHOPPING;
                break;
            case 5:
                typeOfTravel = TypeOfTravel.CRUISE;
                break;
        }
        selectionLevel++;
        System.out.println("0. все варианты;\n1. самолет;\n2. автобус;\n3. поезд;\n4. пароход;\n5. самостоятельно.");
    }

    static void selectByTypeOfTransport(int choice) {
        switch (choice) {
            case 0:
                typeOfTransport = null;
                break;
            case 1:
                typeOfTransport = TypeOfTransport.PLANE;
                break;
            case 2:
                typeOfTransport = TypeOfTransport.BUS;
                break;
            case 3:
                typeOfTransport = TypeOfTransport.TRAIN;
                break;
            case 4:
                typeOfTransport = TypeOfTransport.SHIP;
                break;
            case 5:
                typeOfTransport = TypeOfTransport.WITHOUT_TRANSPORT;
                break;
        }
        selectionLevel++;
        System.out.println("0. все варианты;\n1. все включено;\n2. полный пансион;\n3. завтрак и ужин;\n" +
                "4. завтрак;\n5. без питания.");
    }

    static void selectByTypeOfFood(int choice) {
        switch (choice) {
            case 0:
                typeOfFood = null;
                break;
            case 1:
                typeOfFood = TypeOfFood.ALL_INCLUSIVE;
                break;
            case 2:
                typeOfFood = TypeOfFood.FULL_BOARD;
                break;
            case 3:
                typeOfFood = TypeOfFood.HALF_BOARD;
                break;
            case 4:
                typeOfFood = TypeOfFood.BREAKFAST;
                break;
            case 5:
                typeOfFood = TypeOfFood.WITHOUT_FOOD;
                break;
        }
        System.out.println("0. все варианты;\n1. до 5 дней;\n2. 6 - 10 дней;\n3. 11 - 15 дней;\n4. 16 - 20 дней;" +
                "\n5. более 20 дней.");
        selectionLevel++;
    }

    static void selectByNumberOfDays(int choice) {
        switch (choice) {
            case 0:
                minDays = 0;
                maxDays = 100;
                break;
            case 1:
                minDays = 0;
                maxDays = 5;
                break;
            case 2:
                minDays = 5;
                maxDays = 10;
                break;
            case 3:
                minDays = 10;
                maxDays = 15;
                break;
            case 4:
                minDays = 15;
                maxDays = 20;
                break;
            case 5:
                minDays = 20;
                maxDays = 100;
                break;
        }
        System.out.println("0. все варианты;\n1. до 500;\n2. 501 - 1000;\n3. 1001 - 1500;\n4. 1501 - 2000;" +
                "\n5. больше 2000.");
        selectionLevel++;
    }

    static void selectByPrice(int choice) {
        switch (choice) {
            case 0:
                minPrice = 0;
                maxPrice = 1000000;
                break;
            case 1:
                minPrice = 0;
                maxPrice = 500;
                break;
            case 2:
                minPrice = 500;
                maxPrice = 1000;
                break;
            case 3:
                minPrice = 1000;
                maxPrice = 1500;
                break;
            case 4:
                minPrice = 1500;
                maxPrice = 2000;
                break;
            case 5:
                minPrice = 2000;
                maxPrice = 1000000;
                break;
        }
        selectionLevel++;
        Main.findSort(typeOfTravel, typeOfTransport, typeOfFood, minDays, maxDays, minPrice, maxPrice);
    }
}