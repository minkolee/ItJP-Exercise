package ijp.chapter19;

/**
 * 二分查找法要再熟练一些
 * 不难
 */

public class Question7 {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 19, 20, 23, 26, 28, 39, 40, 51, 55, 56, 77, 99, 100};

        System.out.println(binarySearch(array, -3));
        System.out.println(binarySearch(array, 1));
        System.out.println(binarySearch(array, 2));
    }


    private static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int start = 0;
        int end = list.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (list[mid].compareTo(key) == 0) {
                return mid;
            } else if (list[mid].compareTo(key) > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            System.out.print("start is " + start + "|");
            System.out.print("end is " + end + "|");
            System.out.println("mid is " + mid + "|");
        }
        return -start - 1;
    }
}
