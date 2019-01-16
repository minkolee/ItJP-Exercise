package ijp.chapter19;

import java.util.ArrayList;
import java.util.Random;

/**
 * 打乱的思路是生成一些随机的int,然后交换不同元素的位置.
 * 用等于数组长度的循环,每次生成数组索引范围内的两个int索引,然后交换两个元素的位置
 *
 */

public class Question8 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        arr.add(10);
        arr.add(102);
        arr.add(104);
        arr.add(103);
        arr.add(120);
        shuffle(arr);
        System.out.println(arr);
    }


    private static <E> void shuffle(ArrayList<E> list) {
        E temp;
        int first;
        int second;
        Random rand = new Random();
        for (int i = 0; i < list.size(); i++) {
            first = rand.nextInt(list.size());
            second = rand.nextInt(list.size());
            temp = list.get(first);
            list.set(first, list.get(second));
            list.set(second, temp);
        }
    }
}
