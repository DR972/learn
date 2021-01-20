package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class Region {
    private final String region;
    private final String center;
    private final int population;
    private final int square;
    private final ArrayList<District> districts;

    public Region(String region, String center, int population, int square, ArrayList<District> districts) {
        this.region = region;
        this.center = center;
        this.population = population;
        this.square = square;
        this.districts = districts;
    }

    @Override
    public String toString() {
        return String.format("%-25s центр: %-8s\t\tнаселение: %,-8d человек\t\tплощадь:%,6d км²",
                region, center, population, square);
    }
}
