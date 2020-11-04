package go.g2academy.ArrayDay7;

public class ArrayEnhancedLoop {
    private int[] list = {1,5,6,8,10};


    public int calculateSumOfAllItems() {
        int sum = 0;
        for (int item: list){
            sum = sum + item; //calculation
        }
        return sum;
    }

    public int calculateMultiplicationOfAllItems() {
        int sum = 1;
        for (int element: list){
            sum = sum * element;
        }
        return sum;
    }

    public int calcutaleAverageOfAllItems() {
        int sum = calculateSumOfAllItems()/ list.length;
//        int sum = 0;
//        for (int items: list){
//            sum = sum + items;
//        }
//        int average = sum/list.length;

        return sum;
    }
}
