package ijp.chapter3;


/**
 * random coordinate in a rectangle centered at (0, 0) with width 100 and height 200
 * 随机数从0到几,就乘以几加1,再做平移修正即可
 */

public class E16 {
    public static void main(String[] args) {
        int a =(int) (Math.random() * 101 - 50);
        int b =(int) (Math.random() * 201 - 100);
        System.out.println("(" + a + ", " + b + ")");
    }
}

