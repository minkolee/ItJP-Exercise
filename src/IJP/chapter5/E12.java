package ijp.chapter5;


public class E12 {
    public static void main(String[] args) {
        int i = 0;
        while (Math.pow(i, 2) < 12000) {
            i++;
        }
        System.out.println(i - 1);
    }
}
