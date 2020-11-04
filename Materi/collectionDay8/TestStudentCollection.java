package go.g2academy.collectionDay8;

import java.util.ArrayList;
import java.util.Iterator;

public class TestStudentCollection {
    public static void main(String[] args) {
        //Creating user-defined class objects
        Student sonoo = new Student(101, "Sonoo",23);
        Student ravi = new Student(102, "Ravi",21);
        Student hanumat = new Student(103, "Hanumat",25);

        //Creating ArrayList
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(sonoo);   //Adding Student class Object
        studentList.add(ravi);
        studentList.add(hanumat);

        for (Student st : studentList){
            System.out.println(st.id + " " + st.name + " " + st.age);
        }

        //Cara ke-2

        //Geeting Iterator
//        Iterator itr = studentList.iterator();

        //Traversing elements of Arraylist object
//        while (itr.hasNext()){
//            Student st = (Student)itr.next();
//            System.out.println(st.id + " " + st.name + " " + st.age);
//        }

    }
}
