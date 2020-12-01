package by.epam.learn.main;

class Sequence {
    public int replacements = 0;
    private final double[] arr;
    private final int z;
    private final double newNumber;

    public Sequence(double[] arr, int z, double newNumber) {
        this.arr = arr;
        this.z = z;
        this.newNumber = newNumber;
    }

    public double[] searchSequence() {
        double[] newArr = arr;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > z) {
                newArr[j] = newNumber;
                replacements++;
            }
        }
        return newArr;
    }

    public int replacements() {
        return replacements;
    }
}
