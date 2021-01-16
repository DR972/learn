package by.epam.learn.main.modul5.textFile;

import java.util.ArrayList;

public class TextFile {
    private final String directory;
    private final ArrayList<Directory> files;

    public TextFile(String directory, ArrayList<Directory> files) {
        this.directory = directory;
        this.files = files;
    }

    void createFile(String fileName, File text) {
        files.add(new Directory(fileName, text));
    }

    void renameFile(String oldName, String newName) {
        for (Directory file : files) {
            if (oldName.equals(file.getFileName())) {
                file.setFileName(newName);
            }
        }
    }

    void addText(String fileName, File text) {
        for (Directory file : files) {
            if (fileName.equals(file.getFileName())) {
                file.setText(new File((file.getText()).toString() + text));
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

    public String getDirectory() {
        return directory;
    }

    public ArrayList<Directory> getFiles() {
        return files;
    }

    @Override
    public String toString() {
        return getDirectory() + getFiles();

    }
}
