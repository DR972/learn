package by.epam.learn.main.modul3.simpleClasess;

public class DecimalCounter {
    private int minValue;
    private int maxValue;
    private int currentValue;

    DecimalCounter(int min, int max, int current) {
        minValue = min;
        maxValue = max;
        currentValue = current;
        if (maxValue < minValue) {
            int tmp = maxValue;
            maxValue = min;
            minValue = tmp;
        }
        if (currentValue < minValue) currentValue = minValue;
        if (currentValue > maxValue) currentValue = maxValue;
    }

    public void increase() {
        currentValue++;
        if (currentValue > maxValue) currentValue = minValue;
    }

    public void decrease() {
        currentValue--;
        if (currentValue < minValue) currentValue = maxValue;
    }

    public int have() {
        return currentValue;
    }
}
