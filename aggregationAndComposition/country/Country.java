package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class Country {
    private final String country;
    private final String capital;
    private final int population;
    private final int square;
    private final ArrayList<Region> regions;

    public Country(String country, String capital, int population, int square, ArrayList<Region> regions) {
        this.country = country;
        this.capital = capital;
        this.population = population;
        this.square = square;
        this.regions = regions;
    }

    void addRegion(String region, String center, int population, int square, ArrayList<District> districts) {
        regions.add(new Region(region, center, population, square, districts));
    }

    @Override
    public String toString() {
        return String.format("Страна:%9s\tстолица:%6s\tнаселение:%,10d человек\tплощадь:%,8d км²",
                country, capital, population, square);
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }
}
