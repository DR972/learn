package by.epam.learn.main.modul5.dragonTreasures.processing;

import by.epam.learn.main.modul5.dragonTreasures.storage.Treasure;

import java.util.List;

import static java.util.Comparator.*;

public class Cave {
    private final List<Treasure> treasures;

    static int number;

    public Cave(List<Treasure> treasures) {
        this.treasures = treasures;
        treasures.sort(comparingInt(Treasure::getPrice).reversed());
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }

    public void printAllTreasures() {
        System.out.println(getTreasures());
    }

    public void chooseTheMostExpensiveTreasure() {
        System.out.println("Most valuable dragon treasure: " + treasures.get(0));
    }

    public void chooseTreasureForGivenAmount(int amount) {
        if (treasures.get(treasures.size() - 1).getPrice() > amount) {
            System.out.println("There will be nothing for this amount.");
            return;
        }
        sortTreasuresExternalLoop(amount);
        number = 0;
    }

    private int finishSorting(int amount) {
        int sum = 0;
        for (int i = treasures.size() - 1; i > 0; i--) {
            sum += treasures.get(i).getPrice();
            if (sum + treasures.get(i - 1).getPrice() > amount) {
                return i;
            }
        }
        return 0;
    }

    private void sortTreasuresExternalLoop(int amount) {
        for (int externalVariable = 0; externalVariable < finishSorting(amount) + 1; externalVariable++) {
            int amount1 = amount;
            if (treasures.get(externalVariable).getPrice() <= amount1) {
                number++;
                System.out.print("\nVariant " + number + ":" + treasures.get(externalVariable));
                amount1 -= treasures.get(externalVariable).getPrice();
                sortTreasuresInnerLoop(treasures.size() - 1, amount1, externalVariable);
            }
        }
    }

    private void sortTreasuresInnerLoop(int internalVariable, int amount, int externalVariable) {
        int amount1 = amount;
        for (int j = internalVariable; j > externalVariable; j--) {
            if (treasures.get(j).getPrice() <= amount1) {
                System.out.print(treasures.get(j));
                amount1 -= treasures.get(j).getPrice();
            } else break;
        }

        if (treasures.get(internalVariable - 1).getPrice() <= amount && (internalVariable - 1) > (externalVariable + 1)) {
            internalVariable--;
            number++;
            System.out.print("\nVariant " + number + ":" + treasures.get(externalVariable));
            sortTreasuresInnerLoop(internalVariable, amount, externalVariable);
        }
    }

    @Override
    public String toString() {
        return getTreasures().getClass() + getTreasures().toString();
    }

}
