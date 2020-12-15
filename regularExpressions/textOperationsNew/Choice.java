package by.epam.learn.main;

import java.io.IOException;

public class Choice {

    void choiceOn(int choice) throws IOException {
        switch(choice) {
            case 1: Main.resultSortingParagraphs();
                break;
            case 2: Main.resultSortingWordsByLength();
                break;
            case 3: Main.resultSortingLexemes();
                break;
        }
    }

    void showMenu(int n) {
        if (n == 0) {
            System.out.println("\nПривет! С чего начнем?");
        } else System.out.println("\nПродолжим?");
        System.out.println("- введите \"1\" для сортировки абзацев по количеству предложений; \n" +
                "- введите \"2\" для сортировки в каждом предложении слов по длине;\n" +
                "- введите \"3\" для сортировки лексем в предложениях по убыванию количества \n" +
                "  вхождений заданного символа, а в случае равенства - по алфавиту.\n" +
                "Для завершения работы приложения введите \"0\".");
    }

    boolean isvalid(int ch) {
        return !(ch < 0 || ch > 3);
    }
}


