
public class BackPack {

    static int[] arr = new int[]{603, 570, 567, 550, 542, 540, 512, 504, 500, 480, 477, 470, 450, 450, 441, 415, 395, 390, 390, 360,
            360, 342, 340, 333, 324, 315, 252, 250, 248, 248, 234, 216, 216, 213, 199, 197, 190, 176, 129, 125, 99, 88, 80};
    static int max = 500;
    static int[][] newArr = new int[150][5];
    static int i1;
    StringBuilder s = new StringBuilder();

    public static void main(String[] args) {

        loop();
        int k = 1;
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(k + "\t");
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + "\t");
            }
            k++;
            System.out.println();
        }
    }

    public static void loop() {
        for (int i = 0; i < 38; i++) {
            int max1 = max;
            int j1 = 0;
            if (arr[i] <= max1) {
                newArr[i1][j1] = arr[i];
                max1 -= arr[i];
                j1++;
                System.out.println("i= " + i + " newArr[" + i1 + "][" + (j1 - 1) + "]=" + newArr[i1][j1 - 1] + " max1=" + max1 + " j1=" + j1);

                int i11 = innerLoop(arr.length - 1, max1, i1, j1, i);
                System.out.println("i11=" + i11);
                i1 = i11;

                i1++;
            }
        }
    }


    public static int innerLoop(int j0, int max, int i1, int j1, int i) {

        int max1 = max;
        int j11 = j1;
        for (int j = j0; j > i + 1; j--) {
            System.out.println("i1= " + i1 + " j=" + j + " max1=" + max1 + " j1=" + j11);
            if (arr[j] <= max1) {
                newArr[i1][j11] = arr[j];
                max1 -= arr[j];
                j11++;

                System.out.println("RRRi= " + " newArr[" + i1 + "][" + (j11 - 1) + "]=" + newArr[i1][j11 - 1] + " max1=" + max1 + " j1=" + j11);
            } else break;
        }

        if (arr[j0-1] <= max) {
            j0--;
            i1++;
            System.out.println("??????");
            newArr[i1][0] = arr[i];
            System.out.println("QQi= " + " newArr[" + i1 + "][" + (0) + "]=" + newArr[i1][0] + " max1=" + max + " j1=" + j11);
            innerLoop(j0, max, i1, j1, i);
        }
        //i1++;
        System.out.println("i1= " + i1);
        return i1 ;
    }
}
