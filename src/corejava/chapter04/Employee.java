package corejava.chapter04;

import java.time.LocalDate;


public class Employee {
    private String name;
    private double salary;
    protected LocalDate hireDay;

    public Employee() {
        name = "Jenny";
        salary = 45000.0 * 12;
        hireDay = LocalDate.of(2014, 6, 29);

    }


    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}