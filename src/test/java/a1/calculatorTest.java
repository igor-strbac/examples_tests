package a1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class calculatorTest {

    @Test
    void sumTest() {
        calculator calc = new calculator();
        int result = calc.sum(2, 2);
        if (result != 4) {
            Assert.fail();
        }
    }

    @Test
    void minusTest() {
        calculator calc = new calculator();
        Assert.assertEquals(0, calc.minus(2, 2));
    }

    @Test
    void divideTest() {
        calculator calc = new calculator();
        Assert.assertEquals(2, calc.divide(6, 3));
    }

    @Test()
    void multiplyTest() {
        calculator calc = new calculator();
        Assert.assertEquals(6, calc.divide(12, 2));
    }

}