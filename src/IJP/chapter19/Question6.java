package ijp.chapter19;

public class Question6 {

    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 6}, {13, 4, 5, 6, 7}, {4, 5, 3, 3, 22}, {3, 3, 9, 6, 7}, {3, 5, 6, 7, 8}};

        System.out.println(max(array));
    }


    public static <E extends Comparable<E>> E max(E[][] list) {
        E max = list[0][0];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length; j++) {
                if (max.compareTo(list[i][j]) < 0) {
                    max = list[i][j];
                }
            }
        }
        return max;

    }
}
