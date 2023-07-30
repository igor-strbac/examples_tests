package b1.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class stringConcatenatorTest {

    @Test
    public void testStringConcatenation() {
        stringConcatenator concatenator = new stringConcatenator();

        String str1 = "Hello, ";
        String str2 = "World!";
        String expected = "Hello, World!";

        String result = concatenator.concatenateStrings(str1, str2);
        assertEquals(expected, result, "Test Failed!");
    }

}