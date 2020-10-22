import java.util.Date;
import java.text.SimpleDateFormat;

public class CommentOver {

    public static void main(String[] args) {
        // SimpleDateFormat d = new SimpleDateFormat("dd");
        // SimpleDateFormat m = new SimpleDateFormat("MM");
        // SimpleDateFormat y = new SimpleDateFormat("yyyy");
        // Date dateobj = new Date();
        // System.out.println(d.format(dateobj));
        // System.out.println(m.format(dateobj));
        // System.out.println(y.format(dateobj));

        if(args.length <= 2){
            int a = Integer.parseInt(args[1]);
            double phi = 3.14;

            switch (args[0]) {
                case "1":
                    int result1 = boxFunction(a);
                    System.out.println("Total Luas Persegi: " + result1 + "cm\u00B2\n");
                    break;
                case "2":
                    double result2 = circleFunction(a,phi);
                    System.out.println("Total Luas Lingkaran: " + result2 + "cm\u00B2\n");
                    break;
                default:
                    System.out.println("Data Tidak Ditemukan!!");
                    break;
            }
        }else if(args.length == 3 ){
            int a = Integer.parseInt(args[1]);
            int b = Integer.parseInt(args[2]);
            double half = 0.5;

            switch (args[0]) {
                case "3":
                    double result3 = triangleFunction(b,a,half);
                    System.out.println("Total Luas Segitiga: " + result3 + "cm\u00B2\n");
                    break;
                default:
                    System.out.println("Data Tidak Ditemukan!!");
                    break;
            }
        }else if(args.length == 4){
            int day = Integer.parseInt(args[1]);
            int month = Integer.parseInt(args[2]);
            int year = Integer.parseInt(args[3]);

            switch (args[0]) {
                case "4":
                    int result4 = oldFunction(day, month, year);
                    System.out.println("Umur Anda Sekarang: " + result4 + " Tahun.\n");
                    break;
                default:
                    System.out.println("Data Tidak Ditemukan!!");
                    break;
            }
        }

        
        
        // for(int i = 0; i < args.length; i++){
        //     String d = args[0];

        //     if(d == "1"){
        //         System.out.println("Total Luas Persegi: " + result + "cm");
        //     }else if(args[0] == "2"){
        //         System.out.println("Total Luas Lingkaran: " + result2 + "cm");
        //     }else if(args[0] == "3"){
        //         System.out.println("Total Luas Segitiga: " + result3 + "cm");
        //     }else{
        //         System.out.println("Data Tidak Ditemukan!!");
        //     }
        // }

            
    }

        public static int boxFunction(int s){
            int box;
            box = s * s;

            System.out.println("\nRumus Luas Persegi \nL = Sisi x Sisi");
            System.out.println("L = "+ s + "cm x " + s + "cm");
            System.out.println("L = "+ (s*s) +"cm\u00B2");

            return box;
        }

        public static double circleFunction(double r, double p) {
            double circle;
            circle = p * (r * r);

            System.out.println("\nRumus Luas Lingkaran \nL = \u03c0 x r\u00B2");
            System.out.println("L = 3,14 x "+ r + "\u00B2cm");
            System.out.println("L = 3,14 x "+ (r*r) + "cm\u00B2");
            System.out.println("L = "+ p * (r*r) + "cm\u00B2");

            return circle;
        }

        public static double triangleFunction(double al, double t, double h) {
            double triangle;
            triangle = h * (al * t);

            System.out.println("\nRumus Luas Segitiga \nL = 1/2 x Alas x Tinggi.");
            System.out.println("L = 1/2 x "+ al +"cm x " + t + "cm");
            System.out.println("L = 1/2 x "+ (al*t) + "cm");
            System.out.println("L = "+ triangle + "cm\u00B2");

            return triangle;
        }

        public static int oldFunction(int d, int m, int y) {
            int old;

            SimpleDateFormat dd = new SimpleDateFormat("dd");
            SimpleDateFormat mm = new SimpleDateFormat("MM");
            SimpleDateFormat yy = new SimpleDateFormat("yyyy");
            Date date = new Date();
            int day = Integer.parseInt(dd.format(date)) - d;
            int month = Integer.parseInt(mm.format(date)) - m;


            if(month < 0){
                old = (Integer.parseInt(yy.format(date)) - y)-1;
                System.out.println("\nUlang Tahun Anda: " + month + " Bulan Lagi.");
            }else if(month > 0){
                old = (Integer.parseInt(yy.format(date)) - y);
                System.out.println("\nUlang Tahun Anda Telah Usai: " + month + " Bulan Lalu.");
            }else if(month == 0 && day < 0 ){
                old = (Integer.parseInt(yy.format(date)) - y)-1;
                System.out.println("\nUlang Tahun Anda: " + day + " Hari Lagi.");
            }else if(month == 0 && day > 0 ){
                old = (Integer.parseInt(yy.format(date)) - y);
                System.out.println("\nUlang Tahun Anda Telah Usai: " + day + " Hari Lalu.");
            }else if(month == 0 && day == 0 ){
                old = (Integer.parseInt(yy.format(date)) - y);
                System.out.println("\nSelamat Ulang Tahun Yah, Hari Ini Anda Berulang Tahun.");
            }else{
                old = Integer.parseInt(yy.format(date)) - y;

            }

            return old;
        }
    }