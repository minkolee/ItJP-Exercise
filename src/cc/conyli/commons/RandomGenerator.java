package cc.conyli.commons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {

    public static String getRandomString(int length) {
        int i = length;
        if (length == 0) {
            i = 5;
        }

        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            stringBuilder.append((char) (random.nextInt(26) + 97));
        }
        return stringBuilder.toString();
    }

    public static int getRandomIntFrom1(int end) {
        return new Random().nextInt(end) + 1;
    }


    public static List<Integer> getRandomList(int length, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(getRandomIntFrom1(max));
        }
        return list;
    }

    public static List<String> getRandomStringList(int length, int eachLength) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            list.add(getRandomString(eachLength));
        }
        return list;
    }

}
