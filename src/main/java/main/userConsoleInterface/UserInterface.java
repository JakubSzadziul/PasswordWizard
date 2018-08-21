package main.userConsoleInterface;

import main.fileSaver.BufferedFileReader;
import main.generators.GeneratorType;
import main.model.PasswordEntryFacade;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner = new Scanner(System.in);
    private String userInput;
    private int userInputInt;
    private PasswordEntryFacade passwordEntryFacade = new PasswordEntryFacade();
    private BufferedFileReader bufferedFileReader = new BufferedFileReader();

    public void userInterface() {
        boolean quit = true;

        while (quit) {
            System.out.println("Main menu:\n" +
                    "1. Add new password\n" +
                    "2. Wydrukuj liste hasel\n" +
                    "0. Quit");
            userInputInt = Integer.parseInt(scanner.nextLine());
            switch (userInputInt) {
                case 0:
                    quit = false;
                    break;
                case 1:
                    System.out.println("Type in website for your password:");
                    String website = scanner.nextLine();
                    System.out.println("Type in login");
                    String login = scanner.nextLine();
                    System.out.println("How many characters would you like in your password?");
                    int numberOfChars = Integer.parseInt(scanner.nextLine());


                    System.out.println("Choose generator for your password:\n" +
                            "1. Letters only\n" +
                            "2. Letters and numbers\n" +
                            "3. Letters, numbers and special characters");

                    userInputInt = Integer.parseInt(scanner.nextLine());

                    GeneratorType generatorType = null;

                    switch (userInputInt) {
                        case 1:
                            generatorType = GeneratorType.LettersOnly;
                            break;
                        case 2:
                            generatorType = GeneratorType.LettersNumbers;
                            break;
                        case 3:
                            generatorType = GeneratorType.LettersNumbersSpecialChars;
                            break;
                    }

                    passwordEntryFacade.generatePasswordEntry(website, login, numberOfChars, generatorType);

                    System.out.println("Password Added!");

                case 2:
                    try {
                        bufferedFileReader.read
                                ("C:/Users/SZA/IdeaProjects/PasswordWizard2/src/main/resources/Passwords.csv");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
