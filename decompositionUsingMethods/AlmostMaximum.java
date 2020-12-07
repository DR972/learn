package by.epam.learn.main;

public class AlmostMaximum {
    private final int[] array;

    public AlmostMaximum(int[] array) {
        this.array = array;
    }

    public int almostMax() {
        int max = array[0];
        int almost = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                almost = max;
                max = array[i];
            } else if (array[i] > almost && (array[i] != max)) {
                almost = array[i];
            }
        }
        return almost;
    }
}
