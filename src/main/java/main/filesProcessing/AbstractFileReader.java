package main.filesProcessing;

import java.io.File;

abstract class AbstractFileReader implements FileReader{

    public File getFile (String path){

        if (path ==null){
            throw new IllegalArgumentException("Shouldn't be null");
        }

        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(path).getFile());
    }
}
