package main.model;

import main.generators.GeneratorType;
import main.generators.PasswordGeneratorFacade;

public class PasswordEntryFacade {



        private PasswordGeneratorFacade passwordGeneratorFacade = new PasswordGeneratorFacade();

        public PasswordEntry generatePasswordEntry(String website, String login, int length, GeneratorType generatorType) {

            String password = passwordGeneratorFacade.generatePassword(length, generatorType);
            return new PasswordEntry(website, password, login);
        }
    }


