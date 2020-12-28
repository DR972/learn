package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class TourSearch {
    private final String nameOfTravelAgency;
    private final ArrayList<TourPackage> tourPackages;

    private static ArrayList<TourPackage> PACKAGE_OF_TRAVEL = new ArrayList<>();
    private static ArrayList<TourPackage> PACKAGE_OF_TRANSPORT = new ArrayList<>();
    private static ArrayList<TourPackage> PACKAGE_OF_FOOD = new ArrayList<>();
    private static final ArrayList<TourPackage> PACKAGE_OF_Days = new ArrayList<>();

    public TourSearch(String nameOfTravelAgency, ArrayList<TourPackage> tourPackages) {
        this.nameOfTravelAgency = nameOfTravelAgency;
        this.tourPackages = tourPackages;
    }

    void addTravel(String country, String city, TypeOfTravel[] type, TypeOfTransport transport, TypeOfFood food,
                   int numberOfDays, int price) {
        tourPackages.add(new TourPackage(country, city, type, transport,
                food, numberOfDays, price));
    }

    public void sortByTypeOfTravel(TypeOfTravel type) {
        if (type != null) {
            for (TourPackage tours : this.tourPackages) {
                for (TypeOfTravel types : tours.getType()) {
                    if (type == types) {
                        PACKAGE_OF_TRAVEL.add(tours);
                    }
                }
            }
        } else PACKAGE_OF_TRAVEL = this.tourPackages;
    }

    public static void sortByTypeOfTransport(TypeOfTransport transport) {
        if (transport != null) {
            for (TourPackage tours : PACKAGE_OF_TRAVEL) {
                if (transport == tours.getTransport()) {
                    PACKAGE_OF_TRANSPORT.add(tours);
                }
            }
        } else PACKAGE_OF_TRANSPORT = PACKAGE_OF_TRAVEL;
    }

    public static void sortByTypeOfFood(TypeOfFood food) {
        if (food != null) {
            for (TourPackage tours : PACKAGE_OF_TRANSPORT) {
                if (food == tours.getFood()) {
                    PACKAGE_OF_FOOD.add(tours);
                }
            }
        } else PACKAGE_OF_FOOD = PACKAGE_OF_TRANSPORT;
    }

    public static void sortByNumberOfDays(int minDay, int maxDay) {
        for (TourPackage tours : PACKAGE_OF_FOOD) {
            if (tours.getNumberOfDays() > minDay && tours.getNumberOfDays() <= maxDay) {
                PACKAGE_OF_Days.add(tours);
            }
        }
    }

    ArrayList<TourPackage> sortByPrice(int minPrice, int maxPrice) {
        ArrayList<TourPackage> tourPackages = new ArrayList<>();
        for (TourPackage tours : PACKAGE_OF_Days) {
            if (tours.getPrice() > minPrice && tours.getPrice() < maxPrice) {
                tourPackages.add(tours);
            }
        }
        return tourPackages;
    }

    @Override
    public String toString() {
        return "Все предложения турагенства " + nameOfTravelAgency + ", согласно, вашего выбора:";
    }
}
