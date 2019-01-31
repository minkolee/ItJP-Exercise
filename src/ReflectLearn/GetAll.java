package ReflectLearn;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * 突破权限限制获取全部权限的方法
 * 破坏了程序的封装性,调试的时候可以用
 *
 */

public class GetAll {

    public static void main(String[] args) throws Exception {

        // 反射就可以任意通过一个类名,拿到构造器然后创建对象,代码都不用写死
        Class person = Class.forName("ReflectLearn.Person");

        //单独获得空参构造器
        //可以传参数,根据参数类型来获取对应的构造器,不传参数就是取空参构造器

        // 要用获取带权限的方法
        Constructor con2 = person.getDeclaredConstructor(String.class, int.class);

        // 也可以一次性获取全部方法
        Constructor[] con = person.getDeclaredConstructors();
        System.out.println(Arrays.toString(con));

        // 针对单个方法解除权限限制
        con2.setAccessible(true);
        con[1].setAccessible(true);

        System.out.println(con2);

        // 运行空参数构造器
        Object pp1 = con[1].newInstance("jenny",36);
        System.out.println(pp1);

        //最终通过一个类名就得到了类,然后创建出了这个类的对象

    }
}
