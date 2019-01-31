package ReflectLearn;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 获取域也就是成员变量
 *
 */

public class GetFields {

    public static void main(String[] args) throws Exception {

        // 反射就可以任意通过一个类名,拿到构造器然后创建对象,代码都不用写死
        Class person = Class.forName("ReflectLearn.Person");


    }
}
