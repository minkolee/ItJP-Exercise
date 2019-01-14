package ChuanZhiLearning.day15;

public class Question1 {
    public static void main(String[] args) {

        String a = "aabbCC";
        String b = toLowerCase(a);
        System.out.println(b);
        String c = toUpperCase(a);
        System.out.println(c);

    }


    public static boolean isEmpty(String s) {
        return s.length() == 0;
    }

    public static char charAt(String s, int i) {
        return s.charAt(i);
    }

    public static String toLowerCase(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A') {
                sb.append((char)(s.charAt(i) + 32));
            } else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String toUpperCase(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a') {
                sb.append((char)(s.charAt(i) - 32));
            } else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}
