package by.epam.learn.main.modul3.simpleClasess;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
 * и метод  toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами
 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */

import java.util.ArrayList;

public class Main {

    static BookShop shop = new BookShop("Название магазина", new ArrayList<>());

    public static void main(String[] args) {
        shop.addBook("Заживо в темноте", "Майк Омер", "Эксмо", 2020, 416,
                17.67f, "твердый");
        shop.addBook("Скотный Двор", "Джордж Оруэлл", "АСТ", 2017, 256,
                11.38f, "мягкий");
        shop.addBook("Радикальное Прощение", "Колин Типпинг", "София", 2018, 256,
                21.02f, "твердый");
        shop.addBook("1984", "Джордж Оруэлл", "АСТ", 2019, 320,
                13.03f, "твердый");
        shop.addBook("Искусство любить", "Эрих Фромм", "АСТ", 2016, 224,
                11.28f, "мягкий");

        findAuthor();
        findPublisher();
        findYear();
    }

    private static void printResult(ArrayList<Book> list) {
        System.out.println("список доступных книг:");
        System.out.printf("%-11s%-24s%-16s%-14s%-10s%-10s%-11s%s\n",
                "id", "title", "author", "publisher", "year", "pages", "price", "binding");
        System.out.println("-----------------------------------------------------------------" +
                "------------------------------------------");
        if (list.size() == 0) System.out.println("Книги не найдены.");
        else for (Book book : list) {
            System.out.println(book);
        }
        System.out.println("------------------------------------------------------------------" +
                "------------------------------------------\n");
    }

    private static void findAuthor() {
        String author = "Джордж Оруэлл";
        ArrayList<Book> list = shop.findByAuthor(author);
        System.out.print("\nАвтор " + author + " ");
        printResult(list);
    }

    private static void findPublisher() {
        String publisher = "АСТ";
        ArrayList<Book> list = shop.findByPublisher(publisher);
        System.out.print("Издательство " + publisher + " ");
        printResult(list);
    }

    private static void findYear() {
        int year = 2017;
        ArrayList<Book> list = shop.findAfterYear(year);
        System.out.print("Начиная с " + year + " ");
        printResult(list);
    }
}
