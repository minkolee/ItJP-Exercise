package ijp.chapter2;


public class E18 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        int a = 1, b = 2;
        int control = 5;
        for (; a <= 5; a++, b++) {
            System.out.println(a + "\t" + b + "\t" + (int)Math.pow(a, b));
        }
    }
}

