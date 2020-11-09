package Exam1.Hartono.Matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixOperationTest {
    MatrixOperation array = new MatrixOperation();

    @Test
    public void testCalculationAdditionMatrixMethod() {
        int[][] actual = array.calculateMatrixAdditionMethod();
        assertNotNull(actual);
        assertEquals(3, actual.length);
        assertEquals(5, actual[0].length);
        assertEquals(5, actual[0][0]);
        assertEquals(9, actual[2][0]);
        assertEquals(9, actual[1][3]);
        assertNotNull(actual[2][2]);
    }

    @Test
    public void testCalculationMultiplicationMatrixMethod() {
        int[][] actual = array.calculateMatrixMultiplicationMethod();
        assertNotNull(actual);
        assertEquals(3, actual.length);
        assertEquals(5, actual[0].length);
        assertEquals(6, actual[0][0]);
        assertEquals(14, actual[2][0]);
        assertEquals(14, actual[1][3]);
        assertNotNull(actual[2][2]);
    }

}