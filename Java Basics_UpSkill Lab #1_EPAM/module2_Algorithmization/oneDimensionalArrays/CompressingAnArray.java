package by.epam.learn.main;

class CompressingAnArray {
    private final int[] arr;

    public CompressingAnArray(int[] arr) {
        this.arr = arr;
    }

    public void compressing() {
        for (int i=1; i<arr.length; i+= 2) {
            arr[i] = 0;
        }
    }
}
