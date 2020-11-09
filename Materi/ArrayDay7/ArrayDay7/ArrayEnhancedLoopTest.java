package go.g2academy.ArrayDay7;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayEnhancedLoopTest {

    ArrayEnhancedLoop array = new ArrayEnhancedLoop();

    @Test
    public void testSumAllIntensInArrayOfInteger() {
        int actual = array.calculateSumOfAllItems();
        assertEquals(30,actual);
    }

    @Test
    public void testMultiplicationAllItemsInArrayInteger() {
        int actual = array.calculateMultiplicationOfAllItems();
        assertEquals(2400, actual);
    }

    //average of all items

    @Test
    public void testAverageAllItemsInArrayInteger() {
        int actual = array.calcutaleAverageOfAllItems();
        assertEquals(6,actual);
    }
}

//red, green, refactor