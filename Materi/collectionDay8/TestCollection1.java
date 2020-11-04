package go.g2academy.collectionDay8;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection1 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>(); //Creating ArrayList
        list.add("Ravi"); //Adding object in arraylist
        list.add("Vijay");
        list.add("Hary");
        list.add("Ucok");

        //Bila tidak ditambah <String> artinya tipe datanya adalah object dan tidak disarankan.
//        ArrayList list2 = new ArrayList();
//        list2.add("Hartono");
//        list2.add(1);
//        list2.add(100L);
//        list2.add(new MyDate());

        //Cara Panjang
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Enhance Loop (Recomended)
        for (String element: list){
            System.out.println(element);
        }

        //Traveling list through Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Atau

//        Iterator itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}
