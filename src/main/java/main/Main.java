package main;

import main.fileSaver.BufferedFileReader;
import main.fileSaver.FileSaver;
import main.generators.GeneratorType;
import main.generators.PasswordGeneratorFacade;
import main.model.PasswordEntry;
import main.model.PasswordEntryFacade;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedFileReader fileReader = new BufferedFileReader();
        System.out.println(fileReader.read("tekst.txt"));

        PasswordEntryFacade passwordEntryFacade = new PasswordEntryFacade();

        PasswordGeneratorFacade passwordGeneratorFacade = new PasswordGeneratorFacade();
        passwordGeneratorFacade.generatePassword(30,GeneratorType.LettersNumbersSpecialChars);

        FileSaver fileSaver = new FileSaver();
        fileSaver.csvWriterOneByOne(passwordEntryFacade.generatePasswordEntry("Facebook", "MietekMotyka",
                32, GeneratorType.LettersNumbersSpecialChars));

    }


}
