package by.epam.learn.main.modul5.textFile;

import java.util.List;

public class Directory {
    private final String directoryName;
    private final List<File> files;

    public Directory(String directoryName, List<File> files) {
        this.directoryName = directoryName;
        this.files = files;
    }

    void createFile(String fileName, String text) {
        files.add(new TextFile(fileName, text));
    }

    void renameFile(String oldName, String newName) {
        for (File file : files) {
            if (oldName.equals(file.getFileName())) {
                file.setFileName(newName);
            }
        }
    }

    void addText(String fileName, String text) {
        TextFile textFile;
        for (File file : files) {
            if (fileName.equals(file.getFileName()) && file instanceof TextFile) {
                textFile = (TextFile) file;
                textFile.setText(textFile.getText() + text);
            }
        }
    }

    void deleteFile(String fileName) {
        for (int i = 0; i < files.size(); i++) {
            if (fileName.equals(files.get(i).getFileName())) {
                files.remove(i);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder filesString = new StringBuilder();
        getFiles().forEach(file -> filesString.append(file).append("\n"));
        return "\n" + directoryName + "\n" + filesString.toString();
    }

    public List<File> getFiles() {
        return files;
    }
}