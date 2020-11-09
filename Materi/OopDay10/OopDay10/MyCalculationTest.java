package go.g2academy.OopDay10;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCalculationTest {
    MyCalculation calculation = new MyCalculation();

    @Test
    public void testAddition() {
        calculation.addition(1, 10);
        int actual = calculation.z;
        assertEquals(11, actual);
    }

    @Test
    public void testSubtraction() {
        //long abc = 10; //proses down casting
        Calculation calculation = new MyCalculation();
        //Menggunakan yang dibawah juga bisa
//        Calculation calculation = new Calculation();

        calculation.Subtraction(9, 2);
        int actual = calculation.z;
        assertEquals(7, actual);
    }

    @Test
    public void testMultiplication() {
        MyCalculation myCalculation = new MyCalculation();

        myCalculation.multiplication(1, 10);
        int actual = myCalculation.z;
        assertEquals(10, actual);
    }
}