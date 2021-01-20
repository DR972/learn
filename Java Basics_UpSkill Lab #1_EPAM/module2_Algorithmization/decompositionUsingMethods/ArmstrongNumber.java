package by.epam.learn.main;

class ArmstrongNumber {
    private final int k;

    public ArmstrongNumber(int k) {
        this.k = k;
    }

    public int sumOfDigits(int j) {
        int sum = 0;
        int numberOfDigits = (int) (Math.log10(j) + 1);
        for (int i = 0; i < numberOfDigits; i++) {
            sum += Math.pow(j % 10, numberOfDigits);
            j /= 10;
        }
        return sum;
    }

    public String armstrongNumber() {
        String armstrong = "";
        for (int j = 1; j <= k; j++) {
            if (sumOfDigits(j) == j) {
                armstrong += j + "   ";
            }
        }
        return armstrong;
    }
}
