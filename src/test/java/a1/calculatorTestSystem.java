package a1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculatorTestSystem {

    @Test
    public void testCalculator_Addition() {
        calculator calc = new calculator();
        int result = calc.sum(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testCalculator_Subtraction() {

        calculator calc = new calculator();
        int result = calc.minus(10, 4);
        assertEquals(6, result);
    }

    @Test
    public void testCalculator_Multiplication() {

        calculator calc = new calculator();
        int result = calc.multiply(2, 6);
        assertEquals(12, result);
    }

    @Test
    public void testCalculator_Division() {

        calculator calc = new calculator();
        double result = calc.divide(15, 3);
        assertEquals(5.0, result, 0.0001); // Adding a delta for comparing doubles
    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testCalculator_DivisionByZero() {
//        Calculator calculator = new Calculator();
//        calculator.divide(10, 0);
//    }
}