package main;


import java.util.Random;

public class PasswordGeneratorFull implements PasswordGenerator {  //modify tests, package private access

    private String allowedCharacters1 = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789!@#$%^&*()_+-=";

    private Random generator = new Random();


    public StringBuilder generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            password.append(allowedCharacters1.charAt(generator.nextInt(allowedCharacters1.length())));
        }
        return password;
    }
}

