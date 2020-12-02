package by.epam.learn.main;

class ChangeMaxMin {
    private final double[] arr;

    public ChangeMaxMin(double[] arr) {
        this.arr = arr;
    }

    public double[] replacement() {
        double[] newArr = new double[arr.length];
        double min = arr[0];
        double max = arr[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            if (newArr[i] < min) {
                min = newArr[i];
                indexMin = i;
            }
            if (newArr[i] > max) {
                max = newArr[i];
                indexMax = i;
            }

        }
        newArr[indexMax] = min;
        newArr[indexMin] = max;
        return newArr;
    }
}
