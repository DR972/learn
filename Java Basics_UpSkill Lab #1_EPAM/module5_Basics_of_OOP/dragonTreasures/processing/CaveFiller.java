package by.epam.learn.main.modul5.dragonTreasures.processing;

import by.epam.learn.main.modul5.dragonTreasures.storage.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaveFiller {

    public static List<Treasure> fillCaveWithTreasures() throws FileNotFoundException {
        List<Treasure> treasures = new ArrayList<>();
        FileReader fileReader = new FileReader
                ("src/by/epam/learn/main/modul5/dragonTreasures/data/treasures.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
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
        return treasures;
    }
}
