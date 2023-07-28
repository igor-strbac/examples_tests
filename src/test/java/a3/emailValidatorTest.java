package a3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class emailValidatorTest {

    @Test
    public void testIsValidEmail() {
        Assertions.assertTrue(emailValidator.isValidEmail("mikey.marinkovic@gmail.com"), "Email is valid");
        Assertions.assertTrue(emailValidator.isValidEmail("rikitiki0@hotmail.com"), "Email is valid");
        Assertions.assertFalse(emailValidator.isValidEmail("kon.sesic.com"), "Email is not valid");
    }
}