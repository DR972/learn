package by.epam.learn.main;

class Choice {

    void choiceOn(int choice) {
        switch(choice) {
            case 1: Main.resultMatrixColumns();
                break;
            case 2: Main.resultDiagonal();
                break;
            case 3: Main.resultColumnPRowK();
                break;
            case 4: Main.resultMatrixFormation4();
                break;
            case 5: Main.resultMatrixFormation5();
                break;
            case 6: Main.resultMatrixFormation6();
                break;
            case 7: Main.resultMatrixFormation7();
                break;
            case 8: Main.resultSwapColumns();
                break;
            case 9: Main.resultColumnSums();
                break;
            case 10: Main.resultPositiveDiagonalElements();
                break;
            case 11: Main.resultLinesWith5();
                break;
            case 12: Main.resultSortingStrings();
                break;
            case 13: Main.resultSortingColumns();
                break;
            case 14: Main.resultRandomMatrix();
                break;
            case 15: Main.resultOddChangeToMaximum();
                break;
            case 16: Main.resultMagicSquare();
                break;
            case 17: Main.resultCheckMS();
                break;
        }
        System.out.println ();
    }

    void showMenu(int n) {
        if (n == 0) {
            System.out.println("\nПривет! С чего начнем проверку?");
        } else System.out.println("\nПродолжим?");
        System.out.println("Число - номер задания, 0 - выход. Под №17 бонус - тест Магического квадрата.");
    }

    boolean isvalid(int ch) {
        return !(ch < 0 || ch > 17);
    }
}

