package main.filesProcessing;

import com.opencsv.CSVWriter;
import com.opencsv.ICSVWriter;
import main.model.PasswordEntry;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {

    private File file=new File("C:/Users/SZA/IdeaProjects/PasswordWizard2/src/main/resources/Passwords.csv");

    public void csvWriterOneByOne(PasswordEntry passwordEntry) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter (file,true),';',
                ICSVWriter.DEFAULT_QUOTE_CHARACTER,
                ICSVWriter.DEFAULT_ESCAPE_CHARACTER,
                ICSVWriter.DEFAULT_LINE_END);


        String[] passwordEntryList = new String[3];

        passwordEntryList[0]=passwordEntry.getLogin();
        passwordEntryList[1]=passwordEntry.getPassword();
        passwordEntryList[2]=passwordEntry.getWebsite();

        writer.writeNext(passwordEntryList);
        writer.close();

        }
    }


