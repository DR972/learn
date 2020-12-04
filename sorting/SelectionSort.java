package by.epam.learn.main;

class SelectionSort {
    private final int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        for (int i = 0; i < array.length; i++) {
            int temp = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    temp = j;
                    min = array[j];
                }
            }
            array[temp] = array[i];
            array[i] = min;
        }
        return array;
    }
}
