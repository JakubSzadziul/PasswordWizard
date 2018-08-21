package main.generators;

public class PasswordGeneratorFacade {

    private PasswordGenFactory factory;

    public PasswordGeneratorFacade() {
        factory = new PasswordGenFactory();
    }

   public String generatePassword (int length, GeneratorType generatorType){
        return factory.getPassword(length,generatorType).generatePassword(length).toString();
    }
}
