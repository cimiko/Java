import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        int jmlSiswa, sum1 = 0, sum2 = 0, lulus = 0, tidakLulus = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Jumlah Mahasiswa:");
        jmlSiswa = s.nextInt();
        int mhs[] = new int[jmlSiswa];
        for (int i = 0; i < jmlSiswa; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i + 1) + ":");
            mhs[i] = s.nextInt();

            if(mhs[i] >= 75){
                sum1 = sum1 + mhs[i];
                lulus++;
            }else {
                sum2 = sum2 + mhs[i];
                tidakLulus++;
            }
        }
        System.out.println("Nilai Rata-Rata Mahasiswa Yang Lulus:" + sum1/lulus);
        System.out.println("Nilai Rata-Rata Mahasiswa Yang Tidak Lulus:" + sum2/tidakLulus);

        s.close();
    }
}

