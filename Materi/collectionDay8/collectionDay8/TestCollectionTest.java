package go.g2academy.collectionDay8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestCollectionTest {

    //test how to use add all method


    @Test
    public void testUsingAddAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Sonoo");
        secondList.add("Hanumat");

        // Menambahkan semua data list dan secondList
        list.addAll(secondList);

        //Execept result? there are 2 items in list
        int actual = list.size();
        assertEquals(5, actual);
    }

    @Test
    public void testUsingRemoveAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        //Menghapus list Nama yang ada di daftar secondList
        list.removeAll(secondList);

        //Execept result? there are 2 items in list
        int actual = list.size();
        assertEquals(2, actual);
        assertEquals("Vijay", list.get(0));
        assertEquals("Ajay", list.get(1));
    }

    @Test
    public void testUsingRetainAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        //Menghapus list nama yang tidak ada di secondList
        list.retainAll(secondList);

        //Execept result? there are 2 items in list
        int actual = list.size();
        assertEquals(1, actual);
        String actualRavi = list.get(0);
        assertEquals("Ravi", actualRavi);
    }
}