package lambdas.j8functional.chapter3;

/**
 * 字符串的chars()方法可以产生一个流，基于流来计算落在小写字母之间的范围
 */


public class Question6 {



    public static void main(String[] args) {

        String sn = "fdsfdsa321";

        long i = sn.chars().filter(x -> x <= 122 && x >= 97).count();
        System.out.println(i);

    }





}
