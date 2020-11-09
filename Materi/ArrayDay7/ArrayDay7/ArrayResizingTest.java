package go.g2academy.ArrayDay7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayResizingTest {
    ArrayResizing array = new ArrayResizing();

    @Test
    public void testArrayResizing() {

        int[] initialArray = {1,2,3};

        int[] actual = array.resize(initialArray, 5);
        assertNotNull(actual);
        assertEquals(5, actual.length);
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
        assertEquals(3, actual[2]);

    }
}

//red, green, refactor.