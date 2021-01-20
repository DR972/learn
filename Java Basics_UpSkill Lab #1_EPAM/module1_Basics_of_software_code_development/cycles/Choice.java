package by.epam.learn.main;

public class Choice {
    void choiceOn(int what) {
        switch(what) {
            case '1': Input.inp();
                break;
            case '2': Function.fun();
                break;
            case '3': SumOfSquares.square();
                break;
            case '4': ProduktOfSquares.squares();
                break;
            case '5': CharacterCodes.codes();
                break;
            case '6': Dividers.divid();
                break;
            case '7': Figures.figur();
                break;
        }
        System.out.println ();
    }
    void showMenu(int n) {
        if (n == 0) {
            System.out.println("\nПривет! С чего начнем проверку?");
        } else System.out.println("\nПродолжим?");
        System.out.println("Цифра - номер задания, q - выход.");
    }
    boolean isvalid(int ch) {
        return !(ch < '1' | ch > '7' & ch != 'q');
    }
}
