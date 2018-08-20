package main.main.generators;

import java.util.Random;

public class PasswordGeneratorLettersOnly implements PasswordGenerator {  // rewrite tests so that class can be package private


    private String allowedCharacters3 = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
    private Random generator = new Random();


    public StringBuilder generatePassword(int length) {
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            password.append(allowedCharacters3.charAt(generator.nextInt(allowedCharacters3.length())));
        }

        return password;
    }
}
