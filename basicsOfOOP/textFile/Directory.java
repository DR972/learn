package by.epam.learn.main.modul5.textFile;

public class Directory {
    private String fileName;
    private File text;

    public Directory(String fileName, File text) {
        this.fileName = fileName;
        this.text = text;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public File getText() {
        return text;
    }

    public void setText(File text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "\n\t" + getFileName() + ("\n\t\t" + text);
    }
}
