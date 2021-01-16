package by.epam.learn.main.modul5.dragonTreasures.storage;

import java.util.ArrayList;

public abstract class Treasures extends ArrayList<Treasures> {
    String name;
    String description;
    int price;

    public Treasures(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getName() + getDescription() + getPrice() + "\n";
    }
}
