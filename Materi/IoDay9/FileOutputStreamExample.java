package go.g2academy.IoDay9;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream(   //Khusus untuk mengeluarkan output File
                    "/Users/cimiko/Documents/G2 Academy/PartTime_ifnu/Materi/TestIo/testout.txt");//Nama File bisa di custom

            fout.write(65); //"A"
            String stringOut = "\nThis is my first code to write file";
            fout.write(stringOut.getBytes());
            fout.write("\nTest Doank".getBytes());
            fout.close();
            System.out.println("Success...");

        } catch (Exception e){ //e = nama variable
            System.out.println(e);
            //handy, but not suggested in production code
            e.printStackTrace();
        }
        //Continue Do Something...
    }
}
