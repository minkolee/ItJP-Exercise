package ijp.chapter7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * 这个东西的本质就是一个变量50%的概率增加1,最后看变量的数字就知道落入几号索引中
 * <p>
 * 球的个数是执行外循环的次数
 * 机器的槽数 - 1  就是每次执行的内循环的数量
 */
public class E21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = input.nextInt();

        int[] slotsArray = new int[slots];
        for (int i = 0; i < balls; i++) {
            slotsArray[rollBall(slots)]++;
        }
        System.out.println(Arrays.toString(slotsArray));
    }

    public static int rollBall(int slots) {
        Random rand = new Random();
        int initial = 0;
        for (int i = 0; i < slots - 1; i++) {
            if (rand.nextInt(100) <= 49) {
                System.out.print("L");
            } else {
                initial++;
                System.out.print("R");
            }
        }
        System.out.println();
        return initial;
    }


}
