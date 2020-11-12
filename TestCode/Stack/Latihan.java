import java.util.Arrays;
import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner rn = new Scanner(System.in);

        Stack teuku = new Stack();

        System.out.print("Masukan Data: ");
        String data = rn.nextLine();
        data = data.replaceAll("[^\\d.]", "");

        int b = data.length();

        for (int i = 0; i < b; i++) {
            teuku.push(data.charAt(i));
        }

        for (int i = 0; i < b; i++) {
            Object object = teuku.peek();
            System.out.print(object);
            teuku.pop();
        }

        //output: t3chn0l0g1 1nf8rm4s1
    }
}
