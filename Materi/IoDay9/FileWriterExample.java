package go.g2academy.IoDay9;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("/Users/cimiko/Documents/G2 Academy/PartTime_ifnu/Materi/TestIo/testout2.txt");
            writer.write("Welcome to G2\n");
            writer.write("This is code to write string to file");
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
