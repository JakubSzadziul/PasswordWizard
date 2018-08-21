package main.filesProcessing;

import main.model.PasswordEntry;

import java.io.IOException;
import java.util.List;

public class FilesFacade {

    private BufferedFileReader bufferedFileReader;
    private FileSaver fileSaver;

    public FilesFacade() {
        this.bufferedFileReader = new BufferedFileReader();
        this.fileSaver = new FileSaver();
    }

    public List<String> readFile(String path) throws IOException {
        return bufferedFileReader.read(path);
    }

    public void writeToFile(PasswordEntry passwordEntry) throws IOException {
        fileSaver.csvWriterOneByOne(passwordEntry);
    }

}
