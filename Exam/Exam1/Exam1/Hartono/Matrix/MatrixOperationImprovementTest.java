package Exam1.Hartono.Matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixOperationImprovementTest {
    MatrixOperationImprovement matrixOperation = new MatrixOperationImprovement();

    @Test
    public void testMatrixAdditionOperation() {
        int[][] vector1 = {{1,5,9,6,3},{3,5,7,4,1},{9,6,3,2,4}};
        int[][] vector2 = {{3,6,9,8,7},{7,5,3,2,1},{8,5,2,3,6}};
        int[][] actual = matrixOperation.add(vector1,vector2);
        int[][] expected = {{4,11,18,14,10},{10,10,10,6,2},{17,11,5,5,10}};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testMatrixAdditionWithNullParameter() {
        int[][] vector1 = {};
        int[][] vector2 = {};
        int[][] actual = matrixOperation.add(vector1, vector2);
        assertNull(actual);
    }

    @Test
    public void testMatrixAdditionalWithUnequalParameterLength() {
        int[][] vector1 = {{1,5,9,6,3},{3,5,7,4,1},{9,6,3,2,4}};
        int[][] vector2 = {{3,6,9,8,7},{7,5,3,2,1},{8,5,2,3,6},{9,5,1,6,4},{4,7,5,2,1}};
        int[][] actual = matrixOperation.add(vector1,vector2);
        assertNull(actual);
    }
}