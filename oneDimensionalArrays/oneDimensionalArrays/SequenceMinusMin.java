package by.epam.learn.main;

class SequenceMinusMin {
    int minArr;
    int theNumberOfMinimumMembers;
    private final int[] arr;
    private final int n;

    public SequenceMinusMin(int[] arr, int n) {
        this.arr = arr;
        this.n = n;
    }

    public void searchForMinimumMembers() {
        minArr = arr[0];
        theNumberOfMinimumMembers = 0;
        System.out.println();
        for (int i:arr) {
            if (i < minArr) {
                minArr = i;
                theNumberOfMinimumMembers = 0;
            }
            if (i == minArr) {
                theNumberOfMinimumMembers ++;
            }
        }
    }

    public int[] sequenceMinus() {
        int[] newArr = new int[n - theNumberOfMinimumMembers];
        int j = 0;
        for (int k : arr) {
            if (k > minArr) {
                newArr[j] = k;
                j++;
            }
        }
        return newArr;
    }
}