package ijp.chapter5;


public class E3 {
    public static void main(String[] args) {
        int kilo = 1;
        double pounds;
        System.out.println("Kilograms\tPounds");
        for (; kilo <= 199; kilo++) {
            pounds = kilo * 2.2;
            System.out.printf("%-10d\t%6.1f\n", kilo, pounds);
        }
    }
}
