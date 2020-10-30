import java.util.Date;

public class TestMyDate {
    public static void main(String[] args) {

        // String[] x,y,z; untuk menandakan semua adalah array;
        // String a[], b, c[], d[][];

        MyDate today = new MyDate(22, 7, 1964);
        today.showMyDate();
        today.birthDay();
        System.out.println("Memory address: " + today.toString() + "\n");

        MyDate millenium = new MyDate();
        millenium.showMyDate();
        System.out.println("Memory address: " + millenium.toString() + "\n");

        MyDate nextYear = today;
        nextYear.birthDay();
        nextYear.showMyDate();

        nextYear = new MyDate();
        nextYear.showMyDate();
        nextYear.birthDay();
        nextYear.showMyDate();


        Date Now = new Date();
        System.out.println("\nMy Date is: " + Now.toString() + "\n");

        // System.out.println("Args index 0: " + args[0]);

    }
}
    