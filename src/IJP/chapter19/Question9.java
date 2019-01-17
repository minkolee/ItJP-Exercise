package ijp.chapter19;

import java.util.ArrayList;
import java.util.Random;

/**
 * 找最大值,找了无数遍了
 *
 */

public class Question9 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-17);
        arr.add(-14);
        arr.add(-15);
        arr.add(-16);
        arr.add(-133);
        arr.add(-120);
        arr.add(-102);
        arr.add(-104);
        arr.add(-18);
        arr.add(-19);
        arr.add(-1);
        arr.add(-12);
        arr.add(-13);
        arr.add(-190);
        System.out.println(max(arr));

    }

    private static <E extends Comparable<E>> E max(ArrayList<E> list) {
        // 找最小值,简单
        if (list.size() == 1) {
            return list.get(0);
        } else {
            E max = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (max.compareTo(list.get(i)) < 0) {
                    max = list.get(i);
                }
            }
            return max;
        }
    }
}
