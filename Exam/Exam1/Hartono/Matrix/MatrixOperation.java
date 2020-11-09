package Exam1.Hartono.Matrix;

public class MatrixOperation {
    int [][] list1 = {{2,3,5,8,9},{3,6,9,7,4},{7,4,1,2,3}};
    int [][] list2 = {{3,6,9,7,4},{7,4,1,2,3},{2,3,5,8,9}};
    int [][] result = new int[list1.length][list1[0].length];

    public int[][] calculateMatrixAdditionMethod() {
        int[][] c = result;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                result[i][j] = list1[i][j] + list2[i][j];
            }
        }

        return c;
    }

    public int[][] calculateMatrixMultiplicationMethod() {
        int[][] c = result;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                result[i][j] = list1[i][j] * list2[i][j];
            }
        }

        return c;
    }
}
