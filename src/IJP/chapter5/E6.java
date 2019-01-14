package ijp.chapter5;

/**
 * 修改例题,跳过
 */


public class E6 {
    public static void main(String[] args) {
        int kilo = 1;
        int pounds = 20;
        double convertPounds, convertKilo;
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        for (; kilo <= 10; kilo += 1, pounds += 5) {
            convertPounds = kilo * 1.609;
            convertKilo = pounds / 1.609;
            System.out.printf("%-4d\t%-1.3f\t    |\t%-10d\t%-6.3f\n", kilo, convertPounds, pounds, convertKilo);
        }
    }
}
