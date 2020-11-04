package go.g2academy.ArrayDay7;

public class Test {
    public static void main(String[] args) {
        int[] a = {2,5,8};
        int[] b = {3,6,9,5,6};

        int c = a[4] + b[4];

        if (a == null || b == null){
            System.out.println("Null");
        }else{
            System.out.println(c);
        }

    }
}
