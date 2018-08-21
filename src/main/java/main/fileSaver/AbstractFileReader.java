package main.fileSaver;

import java.io.File;
import java.util.Objects;

abstract class AbstractFileReader implements FileReader{

    public File getFile (String path){



        if (path ==null){
            throw new IllegalArgumentException("Shouldn't be null");
        }

        ClassLoader classLoader = getClass().getClassLoader();
        return new File(Objects.requireNonNull(classLoader.getResource(path)).getFile());
    }
}
