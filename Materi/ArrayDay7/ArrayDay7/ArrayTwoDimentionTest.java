package go.g2academy.ArrayDay7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTwoDimentionTest {
    ArrayTwoDimention array = new ArrayTwoDimention();

    @Test
    public void testArrayTwoDimentionInizalization() {
        int[][] actual = array.getTwoDim();
        assertNotNull(actual);
        assertEquals(4,actual.length);
        assertEquals(5, actual[0].length);
        assertEquals(5, actual[1].length);
        assertNull(actual[2]);

    }

    @Test
    public void testArrayNonRectangularTwoDimentionInitalization() {
        int[][] actual = array.getNonRectangularTwoDim();
        assertNotNull(actual);
        assertEquals(4,actual.length);
        assertEquals(2, actual[0].length);
        assertEquals(4, actual[1].length);
        assertNotNull(actual[3]);
    }

    @Test
    public void testDeclareTwoDimension() {
        int[][] actual = array.getDeclareTwoDim();
        assertNotNull(actual);
        assertEquals(4,actual.length);
        assertEquals(5, actual[0].length);
        assertEquals(5, actual[1].length);
        assertEquals(5, actual[2].length);
        assertEquals(5, actual[3].length);
        assertNotNull(actual[3]);
    }
}