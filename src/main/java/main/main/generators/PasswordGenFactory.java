package main.main.generators;

class PasswordGenFactory {


    PasswordGenerator getPassword(int length, GeneratorType type) {

        switch (type) {
            case LettersOnly:
                return new PasswordGeneratorLettersOnly();
            case LettersNumbers:
                return new PasswordGeneratorLettresNumbers();
            case LettersNumbersSpecialChars:
                return new PasswordGeneratorFull();

        }
        return null;
 //       throw new NullPointerException();  // stworz wlasny exception
    }

}
