package ijp.chapter5;

/**
 * 修改例题,跳过
 */


public class E7 {
    public static void main(String[] args) {
        int year = 1;
        double rate = 0.05;
        double current = 10000.0;
        double end = 0;
        double sum = 0;

        for (; year <= 14; year++) {
            current = current * (1 + rate);
            if (year == 10) {
                System.out.printf("The tuition in ten years is %.2f\n", current);
            }

            if (year >= 11) {
                sum += current;
            }

        }
        System.out.printf("total cost of four years’ worth of tuition after the tenth year is %.2f", sum);
    }
}
