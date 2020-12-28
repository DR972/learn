package by.epam.learn.main.modul4.aggregationAndComposition;

public class Car {
    private final String carModel;
    private final Engine engine;
    private final Wheel wheel;

    public Car(String carModel, Engine engine, Wheel wheel) {
        this.carModel = carModel;
        this.engine = engine;
        this.wheel = wheel;
    }

    public boolean checkWheels() {
        return wheel.isUnbroken();
    }

    public int countFuel() {
        return engine.getFuelQuantity();
    }

    public int goKm() {
        return engine.getFuelQuantity() * 100 / engine.getFuelConsumption();
    }

    @Override
    public String toString() {
        return String.format("Автомобиль%12s %s %s", carModel, engine, wheel);
    }
}
