package ijp.chapter19;

import java.util.ArrayList;

/**
 * 打乱的思路是生成一些随机的int,然后交换不同元素的位置.
 * 用等于数组长度的循环,每次生成数组索引范围内的两个int索引,然后交换两个元素的位置
 * 经典的冒泡排序,只不过需要用AL的set和get来实现
 *
 */

public class Question10 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(17);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(103);
        arr.add(120);
        arr.add(102);
        arr.add(104);
        arr.add(18);
        arr.add(19);
        arr.add(1);
        arr.add(12);
        arr.add(13);
        arr.add(10);
        System.out.println(arr);
        sort(arr);
        System.out.println(arr);
    }


    private static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        // 使用冒泡排序
        E temp;
        int current = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = current; j < list.size(); j++) {
                if (list.get(current).compareTo(list.get(j)) > 0) {
                    temp = list.get(j);
                    list.set(j, list.get(current));
                    list.set(current, temp);
                }
            }
            current++;
        }
    }
}
