package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class TourSearch {
    private final String nameOfTravelAgency;
    private final ArrayList<TourPackage> tourPackages;

    public TourSearch(String nameOfTravelAgency, ArrayList<TourPackage> tourPackages) {
        this.nameOfTravelAgency = nameOfTravelAgency;
        this.tourPackages = tourPackages;
    }

    void addTravel(String country, String city, TypeOfTravel[] type, TypeOfTransport transport, TypeOfFood food,
                   int numberOfDays, int price) {
        tourPackages.add(new TourPackage(country, city, type, transport, food, numberOfDays, price));
    }

    ArrayList<TourPackage> sortByTypeOfTravel(TypeOfTravel type) {
        ArrayList<TourPackage> tourPackages = new ArrayList<>();
        for (TourPackage tours : this.tourPackages) {
            for (TypeOfTravel types : tours.getType()) {
                if (type == types) {
                    tourPackages.add(tours);
                }
            }
        }
        return tourPackages;
    }

    ArrayList<TourPackage> sortByTypeOfTransport(TypeOfTransport transport) {
        ArrayList<TourPackage> tourPackages = new ArrayList<>();
        for (TourPackage tours : this.tourPackages) {
            if (transport == tours.getTransport()) {
                tourPackages.add(tours);
            }
        }
        return tourPackages;
    }

    ArrayList<TourPackage> sortByTypeOfFood(TypeOfFood food) {
        ArrayList<TourPackage> tourPackages = new ArrayList<>();
        for (TourPackage tours : this.tourPackages) {
            if (food == tours.getFood()) {
                tourPackages.add(tours);
            }
        }
        return tourPackages;
    }

    ArrayList<TourPackage> sortByNumberOfDays(int minDay, int maxDay) {
        ArrayList<TourPackage> tourPackages = new ArrayList<>();
        for (TourPackage tours : this.tourPackages) {
            if (tours.getNumberOfDays() > minDay && tours.getNumberOfDays() <= maxDay) {
                tourPackages.add(tours);
            }
        }
        return tourPackages;
    }

    ArrayList<TourPackage> sortByPrice(int minPrice, int maxPrice) {
        ArrayList<TourPackage> tourPackages = new ArrayList<>();
        for (TourPackage tours : this.tourPackages) {
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
