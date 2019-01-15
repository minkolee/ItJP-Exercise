package ChuanZhiLearning.day15;

public class Question3 {
    public static void main(String[] args) {
        String[] strings = {"010", "3223", "666", "7890987", "123123"};
        System.out.println(countDCArray(strings));

    }

    public static boolean isDC(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (i > s.length() - 1 - i) {
                break;
            } else

            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static int countDCArray(String[] strings) {
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            if (isDC(strings[i])) {
                sum++;
            }
        }
        return sum;
    }
}
