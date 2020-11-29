package by.epam.learn.main;

class NumberGreaterThanIndex {
    public final int[] arr;

    public NumberGreaterThanIndex(int[] arr) {
        this.arr = arr;
    }

    public String NumberIndex() {
        StringBuilder newNumbers = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > i+1) {
                newNumbers.append(arr[i]).append("\t");
            }
        }
        return newNumbers.toString();
    }
}
