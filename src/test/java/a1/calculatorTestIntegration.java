package a1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTestIntegration {

    @Test
    public void testAdditionAndMultiplication() {
        calculator calc = new calculator();
        int result = calc.sum(3, 5);
        result = calc.multiply(result, 2);
        assertEquals(16, result);
    }

    @Test
    public void testSubtractionAndDivision() {
        calculator calc = new calculator();
        int result = calc.minus(10, 4);
        result = calc.divide(result, 2);
        assertEquals(3, result, 0.0001);
    }

}