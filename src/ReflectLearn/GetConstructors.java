package ReflectLearn;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 获取带参构造器
 *
 */

public class GetConstructors {

    public static void main(String[] args) throws Exception {

        // 反射就可以任意通过一个类名,拿到构造器然后创建对象,代码都不用写死
        Class person = Class.forName("ReflectLearn.Person");

        //单独获得空参构造器
        //可以传参数,根据参数类型来获取对应的构造器,不传参数就是取空参构造器
        // 这里需要用int.class,而不是 Integer.class,因为参数是原始类型,匹配参数的时候无需装箱拆箱
        Constructor con2 = person.getConstructor(String.class, int.class, String.class);

        System.out.println(con2);

        // 运行空参数构造器
        Object pp1 = con2.newInstance("jenny",36,"zhd");
        System.out.println(pp1);

        //最终通过一个类名就得到了类,然后创建出了这个类的对象

    }
}
