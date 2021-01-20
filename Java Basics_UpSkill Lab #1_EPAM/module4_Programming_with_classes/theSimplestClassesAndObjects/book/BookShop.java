package by.epam.learn.main.modul3.simpleClasess;

import java.util.ArrayList;

public class BookShop {
    private String nameOfShop;
    private ArrayList<Book> list;

    public BookShop(String nameOfShop, ArrayList<Book> list) {
        this.nameOfShop = nameOfShop;
        this.list = list;
    }

    void addBook(String title, String author, String publisher, int year, int pages, float price, String binding) {
        list.add(new Book(title, author, publisher, year, pages, price, binding));
    }

    ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : this.list) {
            if (book.getAuthor().compareTo(author) == 0) {
                list.add(book);
            }
        }
        return list;
    }

    ArrayList<Book> findByPublisher(String publisher) {
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : this.list) {
            if (book.getPublisher().compareTo(publisher) == 0) {
                list.add(book);
            }
        }
        return list;
    }

    ArrayList<Book> findAfterYear(int year) {
        ArrayList<Book> list = new ArrayList<>();
        for (Book book : this.list) {
            if (book.getYear() >= year) list.add(book);
        }
        return list;
    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public void setNameOfShop(String nameOfShop) {
        this.nameOfShop = nameOfShop;
    }

    public ArrayList<Book> getList() {
        return list;
    }

    public void setList(ArrayList<Book> list) {
        this.list = list;
    }
}
