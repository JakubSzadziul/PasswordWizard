package main.main.generators;

public class Main {

    public static void main(String[] args) {


PasswordGeneratorFacade passwordGeneratorFacade = new PasswordGeneratorFacade();

        System.out.println(passwordGeneratorFacade.generatePassword(32,GeneratorType.LettersOnly));
    }

}
