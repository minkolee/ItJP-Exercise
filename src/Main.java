import java.util.Arrays;
import java.util.Scanner;

import corejava.chapter03.LotteryDrawing;

public class Main {
    public static void main(String[] args) {
        double smax = 21396.00;
        double smin = 4279.00;

        double social_rate = 22.50;

        double fix = 5000;
        double deduction_fix;
        double deduction_float = 2000;

        double salary;
        double bonus;
        Scanner in = new Scanner(System.in);

        System.out.print("请输入你的月工资: ");
        salary = in.nextDouble();

        System.out.print("请输入你的年终奖: ");
        bonus = in.nextDouble();

        System.out.println("Salary is " + salary + " Bonus is "+bonus);

        if (salary < smin) {
            deduction_fix = smin * social_rate / 100;
        } else if (salary < smax){
            deduction_fix = salary * social_rate / 100;
        } else {
            deduction_fix = smax * social_rate / 100;
        }

        double total_income_after_deduction = salary * 12 - fix * 12 - deduction_fix * 12 - deduction_float * 12;

        System.out.println("fix is "+ fix);
        System.out.println("deduction_fix "+ deduction_fix);
        System.out.println("deduction_float "+ deduction_float);
        System.out.println("total_income_after_deduction "+ total_income_after_deduction);

        double basement_tax;

        if (total_income_after_deduction <=36000) {
            basement_tax = total_income_after_deduction * 0.03;
        }else if(total_income_after_deduction<=144000){
            basement_tax = total_income_after_deduction * 0.1 - 2520;
        }else if(total_income_after_deduction<=300000){
            basement_tax = total_income_after_deduction * 0.2 - 16920;
        } else if(total_income_after_deduction<=420000){
            basement_tax = total_income_after_deduction * 0.25 - 31920;
        } else if(total_income_after_deduction<=660000){
            basement_tax = total_income_after_deduction * 0.3 - 52920;
        } else if(total_income_after_deduction<=960000){
            basement_tax = total_income_after_deduction * 0.35 - 85920;
        } else {
            basement_tax = total_income_after_deduction * 0.45 - 181920;
        }

        if (total_income_after_deduction < 36000) {
        }

        System.out.println("你的基础个人所得税是: "+basement_tax);



    }


}

