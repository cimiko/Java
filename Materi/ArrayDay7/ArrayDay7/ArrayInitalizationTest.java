package go.g2academy.ArrayDay7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayInitalizationTest {
    ArrayInitalization array = new ArrayInitalization();

    @Test
    public void testNamesInitalization() {
        String[] actual = array.getNames();
        assertNotNull(actual);
        assertEquals(3,actual.length);
        assertEquals("Georgianna", actual[0]);
    }

    @Test
    public void testSimpleNamesInitaliztion() {
        String[] actual = array.getSimpleNames();
        assertNotNull(actual);
        assertEquals(3,actual.length);
    }

    @Test
    public void testDatesInizalition() {
        MyDate[] actual = array.getDates();
        assertNotNull(actual);
        assertEquals(3,actual.length);
    }

    @Test
    public void testSimpleDatesInizalition() {
        MyDate[] actual = array.getSimpleDates();
        assertNotNull(actual);
        assertEquals(3,actual.length);
    }
}