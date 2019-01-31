package ReflectLearn;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 获取构造器对象,都通过Class的方法
 *
 */

public class GetConstructor {

    public static void main(String[] args) throws Exception {

        // 反射就可以任意通过一个类名,拿到构造器然后创建对象,代码都不用写死
        Class person = Class.forName("ReflectLearn.Person");
        System.out.println(person);

        ClassLoader cl = person.getClassLoader();
        System.out.println(cl);

        // 获得public权限的构造方法数组
        Constructor[] con = person.getConstructors();
        System.out.println(Arrays.toString(con));

        //单独获得空参构造器
        //可以传参数,根据参数类型来获取对应的构造器,不传参数就是取空参构造器
        Constructor con2 = person.getConstructor();

        System.out.println(con2);

        // 运行空参数构造器
        Object pp1 = con2.newInstance();
        System.out.println(pp1);

        //最终通过一个类名就得到了类,然后创建出了这个类的对象

    }
}
