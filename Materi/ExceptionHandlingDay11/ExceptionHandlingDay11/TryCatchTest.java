package go.g2academy.ExceptionHandlingDay11;

import org.junit.Test;

import static org.junit.Assert.*;

public class TryCatchTest {

    @Test
    public void testAritmeticException() {

        int data = 50 / 0; //may throw exception
        System.out.println("rest of the code...");

    }

    @Test
    public void testArtimeticTryAndCatchException() {

        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("rest of the code...");
        }
    }

    @Test
    public void testArtimeticTryCatchFinallyException() {

        try {
            int data = 50 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block always excuted");
        }
        System.out.println("rest of the code...");
    }

    @Test
    public void testFinallyWhenItHasDifferentFlow() {
        try {
            int data = 50/0;
            System.out.println(data);
        }catch (NullPointerException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally Block Always Excuted");
        }
        System.out.println("rest of the code...");
    }

    @Test
    public void testThrowException() {
        int age = 13;

        if (age<18){
            throw new ArithmeticException("Not Valid Age");
        }else {
            System.out.println("Welcome to vote");
        }

        System.out.println("rest of the code");
    }
}