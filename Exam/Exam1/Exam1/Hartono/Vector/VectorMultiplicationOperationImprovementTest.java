package Exam1.Hartono.Vector;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorMultiplicationOperationImprovementTest {
    VectorOperationImprovement vectorOperation = new VectorOperationImprovement();

    @Test
    public void testMultiplicationVectorOperation() {
        int[] vector1 = {5,6,1,7,8};
        int[] vector2 = {9,5,1,4,7};
        int[] actual = vectorOperation.multi(vector1, vector2);
        int[] expected = {45,30,1,28,56};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testVectorMultiplicationWithNullParameter() {
        int[] vector1 = {};
        int[] vector2 = {};
        int[] actual = vectorOperation.multi(vector1, vector2);
        assertNull(actual);
    }

    @Test
    public void testVectorMultiplicationWithUnequalParameterLength() {
        int[] vector1 = {2,5,8};
        int[] vector2 = {3,5,7,4,1};
        int[] actual = vectorOperation.multi(vector1,vector2);
        assertNull(actual);
    }
}