package Exam1.Hartono.Vector;

import org.junit.Test;

import static org.junit.Assert.*;

public class VectorAdditionOperationImprovementTest {
    VectorOperationImprovement vectorOperation = new VectorOperationImprovement();

    @Test
    public void testVectorAddition() {
        int[] vector1 = {5,6,1,7,8};
        int[] vector2 = {9,5,1,4,7};
        int[] actual = vectorOperation.add(vector1, vector2);
        int[] expected = {14,11,2,11,15};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testVectorAdditionWithNullParameter() {
        int[] vector1 = {};
        int[] vector2 = {};
        int[] actual = vectorOperation.add(vector1, vector2);
        assertNull(actual);
    }

    @Test
    public void testVectorAdditionWithUnequalParameterLength() {
        int[] vector1 = {2,5,8};
        int[] vector2 = {3,5,7,4,1};
        int[] actual = vectorOperation.add(vector1,vector2);
        assertNull(actual);
    }
}