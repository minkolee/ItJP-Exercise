package corejava.chapter03;

import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();
        System.out.print("What is the highest number you can draw?");
        int n = in.nextInt();

        //用1-n 填充数组

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        //从里边选K个数字然后放入一个新数组

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {

            // 生成随机的索引数
            int r = (int) (Math.random() * n);

            // 填充一个索引数进来

            //用数组的最后一个数字覆盖随机位的数字,然后下一步计算范围的时候,让n减少,即在剩下的数组部分内再挑选
            // 这个思路不错,避免了判断,将选择的数字移走就可以了.
            result[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }

    }
}
