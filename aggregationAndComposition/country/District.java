package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class District {
    private final String district;
    private final String center;
    private final int population;
    private final int square;
    private final ArrayList<City> cities;

    public District(String district, String center, int population, int square, ArrayList<City> cities) {
        this.district = district;
        this.center = center;
        this.population = population;
        this.square = square;
        this.cities = cities;
    }
}
