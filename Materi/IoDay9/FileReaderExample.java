package go.g2academy.IoDay9;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("/Users/cimiko/Documents/G2 Academy/PartTime_ifnu/Materi/TestIo/testout2.txt");
        //Print hanya 1 charakter, huruf depan
//            int charRead = reader.read();
//            System.out.println((char) charRead);

        //Print Semua Charaketer/ semua isi string
            int charRead = 0;
            while ((charRead = reader.read()) != -1){
                System.out.print((char) charRead);
            }

            //Atau (Tapi nanti di print -1, lebih baik cara di atas)

//            while (charRead != -1){
//                charRead = reader.read();
//                System.out.print((char) charRead);
//            }
            reader.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
