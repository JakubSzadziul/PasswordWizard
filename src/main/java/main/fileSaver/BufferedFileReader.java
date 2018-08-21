package main.fileSaver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedFileReader extends AbstractFileReader {

    private BufferedReader reader = null;

    public List<String> read(String path) throws IOException, NullPointerException {


        List<String> table = new ArrayList<>();
        File file = getFile(path);

        reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null) {
            table.add(line);
        }

        reader.close();
        return table;
    }


    @Override
    public File getFile(String path) {
        return super.getFile(path);
    }
}

