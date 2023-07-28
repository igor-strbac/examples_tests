package a1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class calculatorTestUnit {

    @Test
    public void testAddition() {
        calculator calc = new calculator();
        int result = calc.sum(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        calculator calc = new calculator();
        int result = calc.minus(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testMultiplication() {
        calculator calc = new calculator();
        int result = calc.multiply(2, 6);
        assertEquals(12, result);
    }

    @Test
    public void testDivision() {
        calculator calc = new calculator();
        double result = calc.divide(15, 3);
        assertEquals(5.0, result, 0.0001);
    }



}