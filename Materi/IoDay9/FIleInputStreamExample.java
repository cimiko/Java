package go.g2academy.IoDay9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FIleInputStreamExample {
    public static void main(String[] args) {

        try {
            FileInputStream fin = new FileInputStream("/Users/cimiko/Documents/G2 Academy/PartTime_ifnu/Materi/TestIo/testout.txt");
            //Membaca hanya 1 charackter
//            int i = fin.read();
//            System.out.print((char)i);

            //Membaca semua yang ada di file
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            //Atau
//            int inputChar = 0;
//            while (inputChar != -1) {
//                inputChar = fin.read();
//                System.out.print((char) inputChar);
//            }
            fin.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
