package by.epam.learn.main;

public class ShellSort {
    private final int[] array;

    public ShellSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        for (int step = array.length / 3; step > 0; step /= 3) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step]; j -= step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
        return array;
    }
}
