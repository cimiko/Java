package go.g2academy.Day6;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleOverloadingTest {

    @Test
    public void testMinFunctionInteger() {
        int actual = ExampleOverloading.minFunction(11,6);
        assertEquals(6,actual);
    }

    @Test
    public void testMinFunction() {
        double actual = ExampleOverloading.minFunction(7.3, 9.4);
        assertEquals(Double.valueOf(7.3), Double.valueOf(actual));
    }
}