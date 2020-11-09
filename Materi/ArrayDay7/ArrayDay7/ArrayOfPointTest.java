package go.g2academy.ArrayDay7;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class ArrayOfPointTest {
    ArrayOfPoint array = new ArrayOfPoint();

    @Test
    public void testCreateArray() {
        Point[] actual = array.createArray();
        assertNotNull(actual);
        assertEquals(10,actual.length);
        assertEquals(0, actual[0].x);
        assertEquals(1, actual[0].y);
        assertEquals(9, actual[9].x);
        assertEquals(10, actual[9].y);
    }
}