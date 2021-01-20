package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class TourSearch {
    private final String nameOfTravelAgency;
    private final ArrayList<TourPackage> tourPackages;

    private static ArrayList<TourPackage> packageOfTravel = new ArrayList<>();
    private static ArrayList<TourPackage> packageOfTransport = new ArrayList<>();
    private static ArrayList<TourPackage> packageOfFood = new ArrayList<>();
    private static final ArrayList<TourPackage> packageOfDays = new ArrayList<>();

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
                        packageOfTravel.add(tours);
                    }
                }
            }
        } else packageOfTravel = this.tourPackages;
    }

    public static void sortByTypeOfTransport(TypeOfTransport transport) {
        if (transport != null) {
            for (TourPackage tours : packageOfTravel) {
                if (transport == tours.getTransport()) {
                    packageOfTransport.add(tours);
                }
            }
        } else packageOfTransport = packageOfTravel;
    }

    public static void sortByTypeOfFood(TypeOfFood food) {
        if (food != null) {
            for (TourPackage tours : packageOfTransport) {
                if (food == tours.getFood()) {
                    packageOfFood.add(tours);
                }
            }
        } else packageOfFood = packageOfTransport;
    }

    public static void sortByNumberOfDays(int minDay, int maxDay) {
        for (TourPackage tours : packageOfFood) {
            if (tours.getNumberOfDays() > minDay && tours.getNumberOfDays() <= maxDay) {
                packageOfDays.add(tours);
            }
        }
    }

    ArrayList<TourPackage> sortByPrice(int minPrice, int maxPrice) {
        ArrayList<TourPackage> tourPackages = new ArrayList<>();
        for (TourPackage tours : packageOfDays) {
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
