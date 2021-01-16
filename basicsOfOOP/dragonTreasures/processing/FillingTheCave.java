package by.epam.learn.main.modul5.dragonTreasures.processing;

import by.epam.learn.main.modul5.dragonTreasures.storage.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FillingTheCave {

    public static List<Treasures> fillCaveWithTreasures() {
        List<Treasures> treasures = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader
                    ("src/by/epam/learn/main/modul5/dragonTreasures/data/treasures.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) { //&& numberOfTreasure-- > 0
                String[] treasureLine = scanner.nextLine().split(" - ");
                String treasureType = treasureLine[0];
                String name = treasureLine[1];
                String description = treasureLine[2];
                int price = Integer.parseInt(treasureLine[3]);
                switch (treasureType) {
                    case "Armament":
                        treasures.add(new Armament(name, description, price));
                        break;
                    case "Coin":
                        treasures.add(new Coin(name, description, price));
                        break;
                    case "Diamond":
                        treasures.add(new Diamond(name, description, price));
                        break;
                    case "Jewelry":
                        treasures.add(new Jewelry(name, description, price));
                        break;
                    case "Porcelain":
                        treasures.add(new Porcelain(name, description, price));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Treasure information file not found.");
        }
        return treasures;
    }
}
