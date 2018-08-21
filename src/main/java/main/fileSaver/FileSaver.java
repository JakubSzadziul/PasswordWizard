package main.fileSaver;

import com.opencsv.CSVWriter;
import main.model.PasswordEntry;

import java.io.FileWriter;
import java.io.IOException;

public class FileSaver {

    public void csvWriterOneByOne(PasswordEntry passwordEntry) throws IOException {
        CSVWriter writer = new CSVWriter(new FileWriter("C:/Users/SZA/IdeaProjects/PasswordWizard2/src/main/resources/Passwords.csv",true));
        String[] passwordEntryList = new String[3];

        passwordEntryList[0]=passwordEntry.getLogin()+";";
        passwordEntryList[1]=passwordEntry.getPassword()+";";
        passwordEntryList[2]=passwordEntry.getWebsite();

        writer.writeNext(passwordEntryList);
        writer.close();

        }
    }

//    public String csvWriterOneByOne() throws Exception{
//        Path path = Paths.get(
//                ClassLoader.getSystemResource("csv/writtenOneByOne.csv").toURI());
//        return CsvWriterExamples.csvWriterOneByOne(Helpers.fourColumnCsvString(), path);
//    }

