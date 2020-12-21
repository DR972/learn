package by.epam.learn.main.modul3.simpleClasess;

public class Book {
    private static int startID = 1;
    private int id;
    private final String title;
    private final String author;
    private final String publisher;
    private final int year;
    private final int pages;
    private final float price;
    private final String binding;

    public Book(String title, String author, String publisher, int year, int pages, float price, String binding) {
        this.id = startID++;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public float getPrice() {
        return price;
    }

    public String getBinding() {
        return binding;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-25s %-20s %-11s %-10s %-8d %-10s %s",
                id, title, author, publisher, year, pages, price, binding);
    }
}
