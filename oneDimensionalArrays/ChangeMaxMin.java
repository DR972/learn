package by.epam.learn.main;

class ChangeMaxMin {
    private final double[] arr;

    public ChangeMaxMin(double[] arr) {
        this.arr = arr;
    }

    public double[] replacement() {
        double[] newArr = arr;
        double min = 0;
        double max = 0;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            }
            if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        newArr[indexMax] = min;
        newArr[indexMin] = max;
        return newArr;
    }
}
