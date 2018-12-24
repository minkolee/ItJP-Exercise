package ijp.chapter1;

public class E11 {
    public static void main(String[] args) {
        int i;
        int people = 312032486;
        for (i = 1; i <= 5; i++) {
            int temp = 365 * 86400 / 7 - 365 * 86400 / 13 + 365 * 86400 / 45;
            people = people + temp * 5;
            System.out.println("The people is " + people + " after " + i + " years.");
        }
    }
}
