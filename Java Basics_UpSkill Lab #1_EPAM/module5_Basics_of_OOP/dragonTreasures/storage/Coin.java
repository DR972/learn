package by.epam.learn.main.modul5.dragonTreasures.storage;

public class Coin extends Treasure {

    public Coin(String name, String description, int price) {
        super(name, description, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("\n%-12s%-30s%-80s%10s", getClass().getSimpleName(), getName(), getDescription(), getPrice());
    }
}
