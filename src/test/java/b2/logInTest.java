package b2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class logInTest {

    @Test
    public void testSuccessfulLogin() {
        logIn loginForm = new logIn("handsomeguy", "qwerty123");

        assertTrue(loginForm.login(), "Successful login!");
        assertTrue(loginForm.isLoggedIn(), "Welcome!");
    }

    @Test
    public void testUnsuccessfulLogin() {
        logIn loginForm = new logIn("nothandsomeguy", "qwertz123");

        assertFalse(loginForm.login(), "Unsuccessful login!");
        assertFalse(loginForm.isLoggedIn(), "Try again!");
    }

}