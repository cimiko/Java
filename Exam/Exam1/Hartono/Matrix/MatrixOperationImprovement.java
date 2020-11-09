package Exam1.Hartono.Matrix;

public class MatrixOperationImprovement {

    public int[][] add(int[][] vector1, int[][] vector2) {
        int[][] sum = null;

        if ((vector1.length != 0) && (vector2.length != 0)) {
            if (vector1.length == vector2.length) {
                sum = new int[vector1.length][vector1[0].length];
                for (int i = 0; i < vector1.length; i++) {
                    for (int j = 0; j < vector1[i].length; j++) {
                        sum[i][j] =vector1[i][j]+vector2[i][j];
                    }
                }
                return sum;
            } else {
                return sum;
            }
        } else {
            return sum;
        }
    }

    public int[][] multi(int[][] vector1, int[][] vector2) {
        int[][] sum = null;

        if ((vector1.length != 0) && (vector2.length != 0)) {
            if (vector1.length == vector2.length) {
                sum = new int[vector1.length][vector1[0].length];
                for (int i = 0; i < vector1.length; i++) {
                    for (int j = 0; j < vector1[i].length; j++) {
                        sum[i][j] =vector1[i][j]*vector2[i][j];
                    }
                }
                return sum;
            } else {
                return sum;
            }
        } else {
            return sum;
        }
    }
}
