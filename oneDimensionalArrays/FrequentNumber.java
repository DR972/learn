package by.epam.learn.main;

import java.util.Arrays;

class FrequentNumber {
    private final int[] arr;

    public FrequentNumber(int[] arr) {
        this.arr = arr;
    }

    public int frequentNumber() {
        int repeats = 1;
        int maxRepeated = 1;
        int index = 0;
        Arrays.sort(arr);

        int i=arr.length-1;
        while (i>0) {
            for (int j=i-1; j>=0; j--) {
                if (arr[i] == arr[j]) repeats++;
            }
            if (repeats >= maxRepeated) {
                maxRepeated = repeats;
                index = i;
            }
            if (i < repeats) break;
            i -= repeats;
            repeats = 1;
        }
        return arr[index];
    }
}
