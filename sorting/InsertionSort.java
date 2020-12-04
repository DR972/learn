package by.epam.learn.main;

public class InsertionSort {
    private final int[] array;

    public InsertionSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        int temp;
        for (int i = 1; i < array.length; i++) {
            temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
        return array;
    }
}
