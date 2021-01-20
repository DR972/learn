package by.epam.learn.main;

class PlusMinusZero {

    public String searchPlusMinusZero(double[] arr) {
        int minus =0;
        int plus=0;
        for (double i : arr) {
            if (i < 0) minus++;
            if (i > 0) plus++;
        }
        return minus + "\t" + plus + "\t" + (arr.length - minus -plus);
    }
}
