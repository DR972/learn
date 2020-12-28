package by.epam.learn.main.modul4.aggregationAndComposition;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Country belarus = new Country("Беларусь", "Минск", 9408400, 207595, new ArrayList<>());
        belarus.addRegion("город Минск", "Минск", 1975000, 349, new ArrayList<>());
        belarus.addRegion("Брестская область", "Брест", 1347000, 32787, new ArrayList<>());
        belarus.addRegion("Витебская область", "Витебск", 1133400, 40051, new ArrayList<>());
        belarus.addRegion("Гомельская область", "Гомель", 1427000, 40372, new ArrayList<>());
        belarus.addRegion("Гродненская область", "Гродно", 1039000, 25127, new ArrayList<>());
        belarus.addRegion("Минская область", "Минск", 1412000, 39854, new ArrayList<>());
        belarus.addRegion("Могилевская область", "Могилев", 1053000, 29068, new ArrayList<>());

        System.out.println("\n" + belarus.toString());
        System.out.println("\nВ Беларуси " + belarus.getRegions().size() + " регионов:");
        for (Region region : belarus.getRegions()) {
            System.out.println(region);
        }
    }
}
