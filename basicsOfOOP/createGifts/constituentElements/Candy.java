package by.epam.learn.main.modul5.createGifts.constituentElements;

public enum Candy implements Type {
    CHOCOLATE_CANDIES("Chocolate candies", 50, 0.75),
    CARAMEL("Caramel", 50, 0.35),
    NUT_CANDY("Nut candy", 50, 1.10),
    MARZIPAN_SWEETS("Marzipan sweets", 50, 1.25),
    PUFF_CANDY("Puff candy", 50, 0.50);

    private final String name;
    private final int weight;
    private final double price;

    Candy(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public static Candy byOrdinal(int ordinal) {
        return Candy.values()[ordinal - 1];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (weight %d g, costs %.2f rubles)", name, weight, price);
    }
}