package ijp.chapter19;

/**
 * 每次判断一下当前元素是否存在返回的列表里,如果存在就跳过,不存在就加进去
 * 用E实现泛型
 */

import java.util.ArrayList;



public class Question3 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Cony");
        list.add("Cony");
        list.add("Cony");
        list.add("Cony");
        list.add("Cony");
        list.add("Cony2");

        ArrayList<String> list1 = removeDuplicates(list);

        System.out.println(list1);
    }


    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> temp = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                if (temp.get(j).equals(list.get(i))) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                flag = false;
                continue;
            } else {
                temp.add(list.get(i));
            }
        }

        return temp;
    }


    public static boolean isInArrayList(ArrayList list,Object key) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(key)) {
                return true;
            }
        }
        return false;
    }
}
