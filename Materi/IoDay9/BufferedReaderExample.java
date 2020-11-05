package go.g2academy.IoDay9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");
    //Cara untuk Print 1x by console
//        String name = br.readLine();
//        System.out.println("Welcome " + name);


    //Cara untuk Print berkali" sampai mengetik stop di console
        String name = "";
        while (!name.equals("stop")) {
            name = br.readLine();
            System.out.println("Data is: " + name);
        }

        br.close();
        r.close();

    }
}
