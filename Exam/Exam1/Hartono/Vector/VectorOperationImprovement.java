package Exam1.Hartono.Vector;

public class VectorOperationImprovement {

    public int[] add(int[] vector1, int[] vector2) {
        int[] sum = null;

        if ((vector1.length != 0) && (vector2.length != 0)){
            if (vector1.length == vector2.length) {
                sum = new int[vector1.length];
                for (int i = 0; i < vector1.length; i++) {
                    sum[i] = vector1[i] + vector2[i];
                }
                return sum;
            } else {
                return sum;
            }
        }else {
            return sum;
        }
    }

    public int[] multi(int[] vector1, int[] vector2) {
        int[] sum = null;

        if ((vector1.length != 0) && (vector2.length != 0)){
            if (vector1.length == vector2.length) {
                sum = new int[vector1.length];
                for (int i = 0; i < vector1.length; i++) {
                    sum[i] = vector1[i] * vector2[i];
                }
                return sum;
            } else {
                return sum;
            }
        }else {
            return sum;
        }
    }
}
