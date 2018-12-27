package ijp.chapter5;


public class E13 {
    public static void main(String[] args) {
        int i = 0;
        while (Math.pow(i, 3) < 12000) {
            i++;
        }
        System.out.println(i - 1);
    }
}
