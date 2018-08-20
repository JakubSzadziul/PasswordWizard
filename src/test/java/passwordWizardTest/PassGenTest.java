package passwordWizardTest;

import main.PasswordGenerator;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PassGenTest {

    @Test
    public void checkIfCharactersInBoundsPass1() {

        StringBuilder generatedPassword = PasswordGenerator.generatePassword1(32);

        Assertions.assertThat(generatedPassword).doesNotContain("[!a-zA-Z0-9!@#$%^&*()_+-=]");
    }
    @Test
    public void checkIfCharactersInBoundsPass2() {

        StringBuilder generatedPassword = PasswordGenerator.generatePassword2(32);

        Assertions.assertThat(generatedPassword).doesNotContain("[!a-zA-Z0-9]");
    }
    @Test
    public void checkIfCharactersInBoundsPass3() {

        StringBuilder generatedPassword = PasswordGenerator.generatePassword3(32);

        Assertions.assertThat(generatedPassword).doesNotContain("[!zA-Z]");
    }
}
