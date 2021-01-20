package by.epam.learn.main;

class Choice {

    void choiceOn(int choice) {
        switch(choice) {
            case 1: Main.resultGcdAndLcm();
                break;
            case 2: Main.resultGcdOf4Numbers();
                break;
            case 3: Main.resultAreaOfRegularHexagon();
                break;
            case 4: Main.resultDistanceBetweenPoints();
                break;
            case 5: Main.resultAlmostMaximum();
                break;
            case 6: Main.resultCoprimeNumbers();
                break;
            case 7: Main.resultTheSumOfFactorials();
                break;
            case 8: Main.enterNumber();
                break;
            case 9: Main.resultAreaOfQuadrangle();
                break;
            case 10: Main.resultDigitsNumbers();
                break;
            case 11: Main.resultMoreNumeral();
                break;
            case 12: Main.resultArrayOfKandN();
                break;
            case 13: Main.resultTwinsNumbers();
                break;
            case 14: Main.resultArmstrongNumber();
                break;
            case 15: Main.resultIncreasingSequence();
                break;
            case 16: Main.resultSumOfNumbers();
                break;
            case 17: Main.resultNumberMinusDigits();
                break;
        }
    }

    void showMenu(int n) {
        if (n == 0) {
            System.out.println("\nПривет! С чего начнем проверку?");
        } else System.out.println("\nПродолжим?");
        System.out.println("Число - номер задания, 0 - выход.");
    }

    boolean isvalid(int ch) {
        return !(ch < 0 || ch > 17);
    }
}
