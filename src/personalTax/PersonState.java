package personalTax;

/**
 * 个税的配置类,主要有社保上下限, 缴纳比例 等等
 */

public class PersonState {
    // 社保上限
    public static final double SS_MAX = 21396;
    // 社保下限
    public static final double SS_MIN = 4279;
    // 社保 8% + 2% + 0.5%
    public static final double SS_RATE = 12.5;
    //公积金 7% 基本+ 5% 补充
    public static final double FS_RATE = 7.0;
    // 社保基数
    private double SS_basement = -1;
    // 月工资
    private double salary;
    // 年终奖
    private double bonus;

    private double fix = 5000;
    private double deduction_ss;
    private static final double DEDUCT_VAR = 0;

    private double new_salary;
    private double new_bonus;


    PersonState(double salary, double bonus) {
        this.salary = salary;
        this.bonus = bonus;
        if (salary < SS_MIN) {
            this.SS_basement = SS_MIN;
        } else if (salary <= 21396) {
            this.SS_basement = salary;
        } else {
            this.SS_basement = SS_MAX;
        }

        deduction_ss = this.SS_basement * (SS_RATE + FS_RATE) / 100;

        if ((fix + deduction_ss + DEDUCT_VAR) * 12 > salary * 12) {
            if (bonus <= (fix + deduction_ss + DEDUCT_VAR) * 12 - salary * 12) {
                new_salary = salary * 12 + bonus;
                new_bonus = 0;
            } else {
                new_salary = (fix + deduction_ss + DEDUCT_VAR) * 12;
                new_bonus = bonus - ((fix + deduction_ss + DEDUCT_VAR) * 12 - salary * 12);
            }
        } else {
            new_salary = salary * 12;
            new_bonus = bonus;
        }


    }

    PersonState(double salary, double bonus, double SS_basement) {
        this.salary = salary;
        this.bonus = bonus;
        if (SS_basement <= 21369 && SS_basement >= 4279) {
            this.SS_basement = SS_basement;
        } else {
            if (salary < SS_MIN) {
                this.SS_basement = SS_MIN;
            } else if (salary <= 21396) {
                this.SS_basement = salary;
            } else {
                this.SS_basement = SS_MAX;
            }
        }
        deduction_ss = this.SS_basement * (SS_RATE + FS_RATE) / 100.0;

        if ((fix + deduction_ss + DEDUCT_VAR) * 12 > salary * 12) {
            if (bonus <= (fix + deduction_ss + DEDUCT_VAR) * 12 - salary * 12) {
                new_salary = salary * 12 + bonus;
                new_bonus = 0;
            } else {
                new_salary = (fix + deduction_ss + DEDUCT_VAR) * 12;
                new_bonus = bonus - ((fix + deduction_ss + DEDUCT_VAR) * 12 - salary * 12);
            }
        } else {
            new_salary = salary * 12;
            new_bonus = bonus;
        }
    }

    public String toString() {
        return "月工资是: " + salary + " 年终奖是: " + bonus + " 每月扣除是: " + (deduction_ss+DEDUCT_VAR+fix) + " 社保基数是:" + SS_basement + " 新工资是: " + new_salary + " 新奖金是: " + new_bonus;
    }

    public double getNew_salary() {
        return new_salary;
    }

    public double taxable_income(){
        return this.new_salary - (fix + deduction_ss + DEDUCT_VAR) * 12;
    }

    public double getNew_bonus() {
        return new_bonus;
    }


    public static double calNormalPIT(double amount) {
        double tax = -1;
        if (amount <= 36000) {
            tax = amount * 0.03;
        } else if (amount <= 144000) {
            tax = amount * 0.1 - 2520;
        } else if (amount <= 300000) {
            tax = amount * 0.2 - 16920;
        } else if (amount <= 420000) {
            tax = amount * 0.25 - 31920;
        } else if (amount <= 660000) {
            tax = amount * 0.3 - 52920;
        } else if (amount <= 960000) {
            tax = amount * 0.35 - 85920;
        } else {
            tax = amount * 0.45 - 181920;
        }

        return tax;
    }

    public static double calBonusPIT(double amount) {
        double tax = -1;
        if (amount / 12 <= 3000) {
            tax = amount * 0.03;
        } else if (amount / 12 <= 12000) {
            tax = amount * 0.1 - 210;
        } else if (amount / 12 <= 25000) {
            tax = amount * 0.2 - 1410;
        } else if (amount / 12 <= 35000) {
            tax = amount * 0.25 - 2660;
        } else if (amount / 12 <= 55000) {
            tax = amount * 0.3 - 4410;
        } else if (amount / 12 <= 80000) {
            tax = amount * 0.35 - 7160;
        } else {
            tax = amount * 0.45 - 15160;
        }
        return tax;
    }

    public double getPackage() {
        return this.salary * 12 + this.bonus;
    }

    public int countPG(int a){
        System.out.println("This is interface.");
        return (int) (Math.random() * 10);
    }


}





























