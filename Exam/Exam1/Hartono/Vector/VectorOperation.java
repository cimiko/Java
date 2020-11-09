package Exam1.Hartono.Vector;

public class VectorOperation {

    private int[] list1 = {10,5,2,6,8,5};
    private int[] list2 = {2,3,7,4,1,9};
    private int[] result = new int[list1.length];

    private int[] listNull1 = {10,5,2,6,8,5,7,8};
    private int[] listNull2 = {2,3,7,4,1,9};
    private int[] result2 = new int[listNull1.length];

    public int[] calculateVectorAdditionMethod() {
        int[] c = result;

        for (int i = 0; i < list1.length; i++) {
            result[i] = list1[i] + list2[i];
        }

        return c;
    }

    public int[] calculateVectorMultiplicationMethod() {
        int[] c = result;

        for (int i = 0; i < list1.length; i++) {
            result[i] = list1[i] * list2[i];
        }
        return c;
    }
}
