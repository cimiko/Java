package go.g2academy.OopDay10;

public class Salary extends Employee{
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
    }

    public String mailCheck(){
        return "Within mailCheck of Salary class, " + super.mailCheck();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0.0){
            this.salary = salary;
        }
    }

    public double computePay(){
        return salary/52;
    }
}
