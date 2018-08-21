package main.generators;

import java.util.Random;

public class PasswordGeneratorLettresNumbers implements PasswordGenerator { // modify tests, package private

    private String allowedCharacters2 ="qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789";
    private Random generator = new Random();

    public StringBuilder generatePassword (int length){
        StringBuilder password = new StringBuilder(length);
        for (int i=0;i<length;++i){
            password.append(allowedCharacters2.charAt(generator.nextInt(allowedCharacters2.length())));
        }

        return password;
    }


}
