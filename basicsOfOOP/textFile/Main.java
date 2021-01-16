package by.epam.learn.main.modul5.textFile;

import java.util.ArrayList;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

    public static void main(String[] args) {
        String directory = "Countries";
        String oldName = "USA";
        String newName = "United States of America";
        String unnecessaryFile = "Great Britain";
        TextFile textFile = new TextFile(directory, new ArrayList<>());
        textFile.createFile("Great Britain", new File("The capital of Great Britain is London."));
        textFile.createFile("USA", new File("Washington, the capital of the United States of America," +
                " is situated on the Potomac River."));
        textFile.createFile("Australia", new File("Geologically Australia is the most ancient of the" +
                " continents."));

        System.out.println("Создали директорию: " + textFile);

        textFile.renameFile(oldName, newName);
        System.out.println("\nПоменяли название файла " + oldName + " на " + newName + ".\n" + textFile);

        textFile.addText("Australia", new File(" In 1770 James Cook, a British navigator, reached the" +
                " coasts of Australia."));
        System.out.println("\nДополнили файл Австралия информацией." + "\n" + textFile);

        textFile.deleteFile(unnecessaryFile);
        System.out.println("\nУдалили файл " + unnecessaryFile + ".\n" + textFile);
    }
}
