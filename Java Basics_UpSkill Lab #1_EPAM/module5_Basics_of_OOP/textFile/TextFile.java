package by.epam.learn.main.modul5.textFile;

public class TextFile extends File {
    private String text;

    public TextFile(String fileName, String text) {
        super(fileName);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return super.getFileName() +"\n\t" + text;
    }
}
