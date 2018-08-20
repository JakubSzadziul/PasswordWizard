package passwordWizardTest;

import main.PasswordGeneratorFull;
import main.PasswordGeneratorLettersOnly;
import main.PasswordGeneratorLettresNumbers;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PassGenTest {

    @Test
    public void checkIfCharactersInBoundsPass1() {

        PasswordGeneratorFull gen = new PasswordGeneratorFull();

        StringBuilder generatedPassword = gen.generatePassword(32);

        Assertions.assertThat(generatedPassword).doesNotContain("[!a-zA-Z0-9!@#$%^&*()_+-=]");
    }
    @Test
    public void checkIfCharactersInBoundsPass2() {

        PasswordGeneratorLettresNumbers gen = new PasswordGeneratorLettresNumbers();

        StringBuilder generatedPassword = gen.generatePassword(32);

        Assertions.assertThat(generatedPassword).doesNotContain("[!a-zA-Z0-9]");
    }
    @Test
    public void checkIfCharactersInBoundsPass3() {

        PasswordGeneratorLettersOnly gen = new PasswordGeneratorLettersOnly();

        StringBuilder generatedPassword = gen.generatePassword(32);

        Assertions.assertThat(generatedPassword).doesNotContain("[!zA-Z]");
    }
}
