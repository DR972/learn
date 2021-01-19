package by.epam.learn.main.modul5.createGiftsNew.model;

public enum Box implements Type {

    CARDBOARD_BOX("Cardboard Box", 1000, 1.5),
    METAL_BOX("Metal Box", 1500, 5.0),
    FABRIC_BAG("Fabric Bag", 750, 2);

    private final String name;
    private final int weight;
    private final double price;

    Box(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public static Box byOrdinal(int ordinal) {
        return Box.values()[ordinal - 1];
    }

    @Override
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s (capacity %d g, costs %.2f rubles)", name, weight, price);
    }
}
