package a1;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTestSystemIntegration {

    @Test
    public void testCalculatorWithLogger() {
        calculator calc = new calculator();

        int result = calc.sum(3, 5);

        assertEquals(8, result);
    }

}

