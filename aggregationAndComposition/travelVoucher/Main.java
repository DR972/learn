package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class Main {
    static private final TourSearch vacation = new TourSearch("Best Agency", new ArrayList<>());
    static private final String S = "------------------------------------------------------------------------------" +
            "------------------------------------------------------------------------------------------------------";

    public static void main(String[] args) {
        makeDatabase();
        SelectionMenu.select();
    }

    public static void makeDatabase() {
        vacation.addTravel("Spain", "Barcelona", new TypeOfTravel[]{TypeOfTravel.RECREATION,
                        TypeOfTravel.EXCURSION, TypeOfTravel.SHOPPING}, TypeOfTransport.PLANE,
                TypeOfFood.HALF_BOARD, 10, 1150);
        vacation.addTravel("Hungary-Montenegro", "Budapest-Budva", new TypeOfTravel[]{TypeOfTravel.RECREATION,
                TypeOfTravel.EXCURSION}, TypeOfTransport.BUS, TypeOfFood.FULL_BOARD, 16, 825);
        vacation.addTravel("Italy", "Rome", new TypeOfTravel[]{TypeOfTravel.EXCURSION,
                TypeOfTravel.SHOPPING}, TypeOfTransport.PLANE, TypeOfFood.BREAKFAST, 7, 712);
        vacation.addTravel("Turkey", "Antalya", new TypeOfTravel[]{TypeOfTravel.RECREATION},
                TypeOfTransport.PLANE, TypeOfFood.ALL_INCLUSIVE, 10, 947);
        vacation.addTravel("Israel", "Neve Zohar", new TypeOfTravel[]{TypeOfTravel.RECREATION,
                TypeOfTravel.TREATMENT}, TypeOfTransport.PLANE, TypeOfFood.FULL_BOARD, 14, 3212);
        vacation.addTravel("Latvia", "Jurmala", new TypeOfTravel[]{TypeOfTravel.TREATMENT,
                        TypeOfTravel.RECREATION, TypeOfTravel.EXCURSION}, TypeOfTransport.TRAIN,
                TypeOfFood.FULL_BOARD, 8, 542);
        vacation.addTravel("Hungary-Austria-Czech", "Budapest-Vein-Prague", new TypeOfTravel[]
                        {TypeOfTravel.EXCURSION, TypeOfTravel.SHOPPING}, TypeOfTransport.BUS, TypeOfFood.BREAKFAST,
                5, 165);
        vacation.addTravel("Italy-Greece-Israel", "Genoa-Katakolon-Athens-Rhodes-Haifa-Heraklion-Civitavecchia",
                new TypeOfTravel[]{TypeOfTravel.RECREATION, TypeOfTravel.CRUISE, TypeOfTravel.EXCURSION,
                        TypeOfTravel.SHOPPING}, TypeOfTransport.SHIP, TypeOfFood.ALL_INCLUSIVE, 12, 3138);
        vacation.addTravel("Italy-Croatia-Greece-Montenegro", "Trieste-Zadar-Bari-Corfu-Kotor-Montenegro-Split",
                new TypeOfTravel[]{TypeOfTravel.RECREATION, TypeOfTravel.CRUISE, TypeOfTravel.EXCURSION,
                        TypeOfTravel.SHOPPING}, TypeOfTransport.SHIP, TypeOfFood.ALL_INCLUSIVE, 8, 980);
        vacation.addTravel("Ukraine", "Koblevo", new TypeOfTravel[]{TypeOfTravel.RECREATION},
                TypeOfTransport.TRAIN, TypeOfFood.FULL_BOARD, 14, 680);
    }

    public static void findSortByTypeOfTravel(TypeOfTravel type) {
        printResult(vacation.sortByTypeOfTravel(type));
    }

    public static void findSortByTypeOfTransport(TypeOfTransport transport) {
        printResult(vacation.sortByTypeOfTransport(transport));
    }

    public static void findSortByTypeOfFood(TypeOfFood food) {
        printResult(vacation.sortByTypeOfFood(food));
    }

    public static void findSortByNumberOfDays(int minDay, int maxDay) {
        printResult(vacation.sortByNumberOfDays(minDay, maxDay));
    }

    public static void findSortByPrice(int minPrice, int maxPrice) {
        printResult(vacation.sortByPrice(minPrice, maxPrice));
    }

    public static void printResult(ArrayList<TourPackage> tourPackages) {
        System.out.println(vacation.toString() + "\n" + S);
        System.out.printf("%-35s %-60s %-42s %-12s %-13s %-5s %s\n", "Страна", "Город", "Тип отдыха", "Транспорт",
                "Питание", "Дни", "Цена" + "\n" + S);
        if (tourPackages.size() == 0) {
            System.out.println("К сожалению, предложить вам нечего, измените выбор.");
        } else {
            for (TourPackage tourPackage : tourPackages) {
                System.out.println(tourPackage);
            }
        }
        System.out.println(S);
    }
}
