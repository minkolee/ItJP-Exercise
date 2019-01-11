package personalTax;

/**
 * @author Minko
 */

public class TestPIT {
    public static void main(String[] args) {
        // 初始化 个税对象 salary 参数是工资, bonus 是年终奖.
        // SS_basement 是社保基数,可以不填,将自动用工资计算.
        // 如果要计算全年总收入的比例,将工资设置为0,bonus设置为全年总收入, SS_basement设置为实际基数.
        PersonState ps1 = new PersonState(8300,80000);
        System.out.println(ps1);

        double taxable_income = ps1.taxable_income();
        double bonus = ps1.getNew_bonus();
        System.out.println("应纳税收入是: " + taxable_income);
        System.out.println("年终奖是: " + bonus);

        double pit;
        double bonuspit;
        int k = 0;
        double min = PersonState.calNormalPIT(taxable_income) + PersonState.calBonusPIT(bonus);

        for (int i = 0; i <= 100; i++) {
            pit = PersonState.calNormalPIT(taxable_income + bonus * i / 100.0);
            bonuspit = PersonState.calBonusPIT(bonus - bonus * i / 100.0);

            if (min > (pit + bonuspit)) {
                min = pit + bonuspit;
                k = i;
            }
            System.out.println("当前比例是: " + i + "%" + " 工资薪金的个税是: " + pit + " 年终奖的个税是: " + bonuspit + " 合计是: " + (pit + bonuspit));

        }
        System.out.println("最小税收出现在比例是 " + k + "% 的时候,此时个税合计是: " + min);
        System.out.println("此时年终奖是 " + (bonus * (1 - k / 100.0)));
        System.out.println("此时工资薪金是 " + (ps1.getPackage() - (bonus * (1 - k / 100.0))));


    }
}
