package go.g2academy.ExceptionHandlingDay11;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AgeValidatorTest {
    AgeValidator validator = new AgeValidator();

    @Test
    public void testValidAgeValidator() {
        boolean actual = validator.validate(25);
        assertTrue(actual);
    }

    @Test
    public void testInvalidAgeValidator() {
        try {
            validator.validate(10);
            assertFalse(false);
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testHandleCheckedExceptionWithTryAndCatch() {
        try {
            validator.validateGender("male");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Cara yang tidak bagus untuk dilakukan
    @Test
    public void testHandleCheckedExceptionWithThrowItFurtherToMethodCaller() throws FileNotFoundException {
        boolean actual = validator.validateGender("female");
    }
}