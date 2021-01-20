package by.epam.learn.main.modul4.aggregationAndComposition;

/**
 * Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 * вывести на консоль текст, заголовок текста.
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String theHeaderText = "Halloween.";
        Word heading = new Word(theHeaderText);
        Text story = new Text(heading, new ArrayList<>());
        story.addSentence("It is an old festival.");
        story.addSentence("It is more than two thousand years old.");
        story.addSentence("In the past this festival was a time of fear because people " +
                "believed in ghosts and witches.");
        String addition = "Halloween is celebrated on the thirty-first of October.";


        System.out.println("\nЕсть текст:\n" + story.getHeading());
        printResult(story.getContent());

        story.addSentence(addition);
        System.out.println("\nТекст после дополнения:\n" + story.getHeading());
        printResult(story.getContent());
    }

    private static void printResult(ArrayList<Sentence> content) {
        for (Sentence sentence : content) {
            System.out.println(sentence);
        }
    }
}
