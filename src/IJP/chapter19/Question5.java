package ijp.chapter19;

public class Question5 {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 3, 4, 5, 67, 7, 8, 5, 4, 3, 3, 3, 54, 6, 7};

        System.out.println(max(array));
    }


    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0];

        for (int i = 0; i < list.length; i++) {
            if (max.compareTo(list[i]) < 0) {
                max = list[i];
            }
        }
        return max;

    }
}
