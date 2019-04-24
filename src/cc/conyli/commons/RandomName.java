package cc.conyli.commons;

import java.util.Random;

public class RandomName {

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


}
