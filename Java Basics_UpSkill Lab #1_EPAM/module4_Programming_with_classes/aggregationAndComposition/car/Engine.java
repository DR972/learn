package by.epam.learn.main.modul4.aggregationAndComposition;

public class Engine {
    private final int power;
    private final int fuelQuantity;
    private final int fuelConsumption;

    public Engine(int power, int fuelQuantity, int fuelConsumption) {
        this.power = power;
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("мощностью%4s лошадей, запасом топлива%3sл, расходом%2sл / 100км,",
                power, fuelQuantity, fuelConsumption);
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}