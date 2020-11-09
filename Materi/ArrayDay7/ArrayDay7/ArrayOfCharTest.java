package go.g2academy.ArrayDay7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOfCharTest {

    @Test
    public void testCreateArray() {
        ArrayOfChar array = new ArrayOfChar();
        char[] actual = array.createArray();
        assertNotNull(actual);
        assertEquals(26, actual.length);
        assertEquals('A', actual[0]);
        assertEquals('Z', actual[25]);
    }
}