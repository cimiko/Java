package go.g2academy.Day6;

public class ConsDemo {
    public static void main(String[] args) {
        //concept class, object => instalisasi class menjadi object lewat new keywoard
        //dan constructor
        //object adalah inisialisasi dari class
        //object is intanttiation of a class

        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass(20);
        MyClass t3 = new MyClass(11);

        System.out.println(t1.x + " " + t2.x + " " + t3.x);
    }
}
