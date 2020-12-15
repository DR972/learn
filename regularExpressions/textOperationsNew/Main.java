package by.epam.learn.main;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int choice;
        int o = 0;
        Choice theTask = new Choice();
        for (; ; ) {
            do {
                theTask.showMenu(o++);
                while (!in.hasNextInt()) {
                    System.out.println("Это не номер!");
                    in.next();
                }
                choice = in.nextInt();
            } while (!theTask.isvalid(choice));
            if (choice == 0) {
                System.out.println("\nНу как? Жду рекомендаций.");
                break;
            }
            theTask.choiceOn(choice);
        }
    }

    private final static String text = "First paragraph. Three sentences. Three.\n" +
            "Second paragraph and just one sentence.\n" +
            "Third paragraph and seven sentences. Second. Third. Fourth. Fifth. Sixth. Seventh.\n" +
            "Fourth paragraph. Five sentences. This is the third sentence. This is the fourth. And this is the fifth.\n" +
            "Fifth paragraph and again one sentence.";

    public static void resultSortingParagraphs() {
        System.out.println("Задание 1. Сортировка абзацев по количеству предложений.\nЕсть текст:\n" + text);
        SortingParagraphs sortingParagraphs = new SortingParagraphs(text);
        System.out.println("\nРезультат:\n" + sortingParagraphs.sortParagraphs());
    }

    public static void resultSortingWordsByLength() {
        System.out.println("Задание 2. Сортировка слов в предложениях по длине.\nЕсть текст:\n" + text);
        SortingWordsByLength sortingWordsByLength = new SortingWordsByLength(text);
        System.out.println("\nРезультат:\n" + sortingWordsByLength.sortText());
    }

    public static void resultSortingLexemes() throws IOException {
        System.out.println("Задание 3. Сортировка слов в  предложенях по убыванию количества вхождений заданного" +
                " символа, а в случае равенства – по алфавиту.Есть текст:\n" + text);
        System.out.println("Пора ввести символ:");
        char letter = (char) System.in.read();
        SortingLexemes sortingLexemes = new SortingLexemes(text, letter);
        System.out.println("\nРезультат:\n" + sortingLexemes.sortText());
    }
}
