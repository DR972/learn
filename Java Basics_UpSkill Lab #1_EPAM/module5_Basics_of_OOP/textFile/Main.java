package by.epam.learn.main.modul5.textFile;

import java.util.ArrayList;

/**
 * Создать объект класса Текстовый файл, используя классы Файл, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

    public static void main(String[] args) {
        String directory1 = "Countries";
        String oldName = "USA";
        String newName = "United States of America";
        String unnecessaryFile = "Great Britain";

        Directory directory = new Directory(directory1, new ArrayList<>());

        directory.createFile("Great Britain", "The capital of Great Britain is London.");
        directory.createFile("USA", "Washington, the capital of the United States of America," +
                " is situated on the Potomac River.");
        directory.createFile("Australia", "Geologically Australia is the most ancient of the" +
                " continents.");

     System.out.println("Создали директорию: " + directory);

        directory.renameFile(oldName, newName);
        System.out.println("\nПоменяли название файла " + oldName + " на " + newName + ".\n" + directory);

        directory.addText("Australia", " In 1770 James Cook, a British navigator, reached the" +
                " coasts of Australia.");
        System.out.println("\nДополнили файл Австралия информацией." + "\n" + directory);

        directory.deleteFile(unnecessaryFile);
        System.out.println("\nУдалили файл " + unnecessaryFile + ".\n" + directory);
    }
}
