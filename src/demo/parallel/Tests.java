package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void testAddition() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 3);
        Complex result = a.plus(b);
        assertEquals(new Complex(3, 4), result);
    }

    @Test
    public void testSubtraction() {
        Complex a = new Complex(5, 5);
        Complex b = new Complex(2, 3);
        Complex result = a.minus(b);
        assertEquals(new Complex(3, 2), result);
    }

    @Test
    public void testMultiplication() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        Complex result = a.times(b);
        assertEquals(new Complex(-5, 10), result);
    }


    @Test
    public void testPower() {
        Complex a = new Complex(1, 1);
        Complex result = a.power(2);
        assertEquals(new Complex(0, 2), result);
    }

    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        double result = a.lengthSQ();
        assertEquals(25, result);
    }
}
