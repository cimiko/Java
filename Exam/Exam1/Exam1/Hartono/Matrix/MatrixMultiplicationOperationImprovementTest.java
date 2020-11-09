package Exam1.Hartono.Matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixMultiplicationOperationImprovementTest {
    MatrixOperationImprovement matrixOperation = new MatrixOperationImprovement();

    @Test
    public void testMatrixMultiplicationOperation() {
        int[][] vector1 = {{1,5,9,6,3},{3,5,7,4,1},{9,6,3,2,4}};
        int[][] vector2 = {{3,6,9,8,7},{7,5,3,2,1},{8,5,2,3,6}};
        int[][] actual = matrixOperation.multi(vector1,vector2);
        int[][] expected = {{3,30,81,48,21},{21,25,21,8,1},{72,30,6,6,24}};
        assertArrayEquals(expected,actual);
    }

    @Test
    public void testMatrixMultiplicationWithNullParameter() {
        int[][] vector1 = {};
        int[][] vector2 = {};
        int[][] actual = matrixOperation.multi(vector1, vector2);
        assertNull(actual);
    }

    @Test
    public void testMatrixMultiplicationWithUnequalParameterLength() {
        int[][] vector1 = {{1,5,9,6,3},{3,5,7,4,1},{9,6,3,2,4}};
        int[][] vector2 = {{3,6,9,8,7},{7,5,3,2,1},{8,5,2,3,6},{9,5,1,6,4},{4,7,5,2,1}};
        int[][] actual = matrixOperation.multi(vector1,vector2);
        assertNull(actual);
    }

}