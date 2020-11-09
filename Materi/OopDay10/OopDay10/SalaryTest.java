package go.g2academy.OopDay10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryTest {

    @Test
    public void testPolymorphimInMethod() {
        Employee employee = new Employee("Hartono", "Tangerang", 05);
        String actual = employee.mailCheck();
        assertEquals("Mailing a check to Hartono Tangerang", actual);

        Employee salary = new Salary("Hartono", "Tangerang", 05, 1_000_000);
        actual = salary.mailCheck();
        assertEquals("Within mailCheck of Salary class, Mailing a check to Hartono Tangerang", actual);

    }

    @Test
    public void testAvoidSettingSalaryToNegativeNumber() {
        Salary salary = new Salary("Hartono", "Tangerang", 05, 1_000_000);
        salary.setSalary(-1);
        double actual = salary.getSalary();
        assertEquals(Double.valueOf(1_000_000), Double.valueOf(actual));
    }

    @Test
    public void testAvoidSettingSalaryToPositiveNumber() {
        Salary salary = new Salary("Hartono", "Tangerang", 05, 1_000_000);
        salary.setSalary(2_000_000);
        double actual = salary.getSalary();
        assertEquals(Double.valueOf(2_000_000), Double.valueOf(actual));
    }
}