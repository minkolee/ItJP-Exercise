package ijp.chapter19;

public class Question4 {

    public static void main(String[] args) {
        Integer[] a = new Integer[7];

        a[0] = 13;
        a[1] = 32;
        a[2] = 33;
        a[3] = 43;
        a[4] = 53;
        a[5] = 763;
        a[6] = 3;

        int index = lineSearch(a, 43);
        System.out.println(index);
        index = lineSearch(a, 3);
    }


    public static <E extends Comparable<E>> int lineSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(key) == 0) {
                return i;
            }
        }

        return -1;


    }
}
