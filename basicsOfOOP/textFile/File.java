package by.epam.learn.main.modul5.textFile;

public class File {
    private final String text;

    public File(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return getText();
    }
}
