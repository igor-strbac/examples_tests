package b1.a;

import b1.a.tempConv;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class tempConvTest {

    @Test
    public void testCelsiusToFahrenheitConversion() {
        tempConv converter = new tempConv();

        double celsius = 25;
        double expectedFahrenheit = 77;

        double resultFahrenheit = converter.celsiusToFahrenheit(celsius);
        assertEquals(expectedFahrenheit, resultFahrenheit, "Failed to convert celsius to fahrenheit");
    }

    @Test
    public void testFahrenheitToCelsiusConversion() {
        tempConv converter = new tempConv();

        double fahrenheit = 68;
        double expectedCelsius = 20;

        double resultCelsius = converter.fahrenheitToCelsius(fahrenheit);
        assertEquals(expectedCelsius, resultCelsius, "Failed to convert fahrenheit to celsius");
    }

}