package ijp.chapter9;


import java.util.Random;

public class testRandom {
    public static void main(String[] args) {
        Random randint = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(randint.nextInt(100)+" ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
