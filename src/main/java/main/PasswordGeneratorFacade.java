package main;

class PasswordGeneratorFacade {

    private PasswordGenFactory factory;

    PasswordGeneratorFacade() {
        factory = new PasswordGenFactory();
    }

    StringBuilder generatePassword (int length, GeneratorType generatorType){

        return factory.getPassword(length,generatorType).generatePassword(length);
    }
}
