package corejava.chapter04;

import java.time.LocalDate;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        //由于父类的域都是私有的,所有要调用父类的初始化构造方法,子类是无法直接访问那些东西的
        bonus = 0;
        this.hireDay = LocalDate.now();
    }


    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        LocalDate nee = super.getHireDay();
        System.out.println(nee);
        bonus = b;
    }
}
