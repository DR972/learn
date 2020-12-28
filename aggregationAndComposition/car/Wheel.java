package by.epam.learn.main.modul4.aggregationAndComposition;

public class Wheel {
    private final int diameter;
    private final boolean unbroken;

    public Wheel(int diameter, boolean unbroken) {
        this.diameter = diameter;
        this.unbroken = unbroken;
    }

    public boolean isUnbroken() {
        return unbroken;
    }

    @Override
    public String toString() {
        return String.format("шинами%4s дюймов и состоянием колес %-16s.", diameter, unbroken);
    }
}
