package ijp.chapter5;


public class E11 {
    public static void main(String[] args) {
        int i = 100;
        int count = 1;
        for (; i <= 1000; i++) {
            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(i + " ");
                if (count % 10 == 0) {
                    System.out.println();
                }
                count++;
            }

        }
    }
}
