package ijp.chapter9;

import java.util.Date;

public class testAccount {
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(4.5);
        a1.withDraw(2500);
        a1.deposit(3000);
        System.out.println("Your balance is "+a1.getBalance());
        System.out.println("Your monthly interest is "+a1.getMonthlyInterest());
        System.out.println("Your account created on "+a1.getDateCreated().toString());
        StopWatch watch = new StopWatch();
        watch.stop();
        watch.getElapsedTime();
    }

}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    Account() {
        this.dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate * 100;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate/100;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12 * 100;
    }

    public double getMonthlyInterest() {
        return this.balance * this.annualInterestRate / 12;
    }

    public void withDraw(double amount) {
        if (amount < 0) {
            System.out.println("Error amount");
            return;
        }
        if (amount > this.balance) {
            System.out.println("You don't have enough money.");
            return;
        } else{
            this.balance -= amount;
            System.out.println("Successfully withdraw " + amount);
        }
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Successfully deposit " + amount);

    }
}
