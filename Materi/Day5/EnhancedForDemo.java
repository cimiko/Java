package go.g2academy.Day5;

public class EnhancedForDemo {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            System.out.println("Value is: " + value);
        }

        System.out.println("\n"); //ATAU

        for (int item : numbers){
            System.out.println("Count is: " + item);
        }

    }
}
