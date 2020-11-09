package Exam1.Hartono.Vector;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorOperationTest {
    VectorOperation array = new VectorOperation();

    @Test
    public void testAdditionVectorOperationResult() {
        int[] actual = array.calculateVectorAdditionMethod();
        assertNotNull(actual);
        assertEquals(6, actual.length);
        assertEquals(12, actual[0]);
        assertEquals(9, actual[2]);
        assertEquals(14, actual[5]);
        assertNotNull(actual[5]);
    }

    @Test
    public void testMultiplicationVectorOperation() {
        int[] actual = array.calculateVectorMultiplicationMethod();
        assertNotNull(actual);
        assertEquals(6, actual.length);
        assertEquals(20, actual[0]);
        assertEquals(14, actual[2]);
        assertEquals(45, actual[5]);
        assertNotNull(actual[5]);
    }
}