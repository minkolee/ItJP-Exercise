package ChuanZhiLearning.day16;

public class TestRegEx {

    public static void main(String[] args) {

        String a = "dauiboiuauisduoifaf";

        long time = System.currentTimeMillis();

        System.out.println(time);

        String regex = "^[1-9][0-9]{4,14}";

        System.out.print(a.matches(regex));
    }

}
