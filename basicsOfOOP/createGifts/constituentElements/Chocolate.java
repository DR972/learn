package by.epam.learn.main.modul5.createGifts.constituentElements;

public enum Chocolate implements Type {
    CHOCOLATE1("Chocolate1", 500, 5.0),
    CHOCOLATE2("Chocolate2", 250, 3.5),
    CHOCOLATE3("Chocolate3", 200, 3.0),
    CHOCOLATE4("Chocolate4", 100, 2.0),
    CHOCOLATE5("Chocolate5", 50, 1.5);

    private final String name;
    private final int weight;
    private final double price;

    Chocolate(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public static Chocolate byOrdinal(int ordinal) {
        return Chocolate.values()[ordinal - 1];
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
