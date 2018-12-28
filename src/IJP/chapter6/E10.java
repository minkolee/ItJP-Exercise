package ijp.chapter6;

/**
 * 判断素数的方法
 */

public class E10 {
    public static boolean isPrime(int a){
        boolean flag = true;
        for(int i=2;i<=a/2;i++){
            if (a % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
