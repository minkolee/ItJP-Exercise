package corejava.chapter04;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;


/**
 * private static final 都是静态绑定
 * 其他的依赖用隐式的对象参数,动态绑定
 * 在覆盖一个方法的时候，子类方法不能低于超类方法的可见性。特别是， 如果超类方法是public, 子类方法一定要声明为public
 * final 修饰类的时候表示不允许扩展该类,其中的所有方法自动成为final方法
 * final 修饰的方法不能被子类覆盖
 * 注意,final 类 其中的 域也就是属性,不会自动变成final
 *
 */

public class TestManager {
    public static void main(String[] args) throws NoSuchFieldException,IllegalArgumentException, IllegalAccessException {

        Employee harry = new Employee("Harry Hacker", 35000, 1989, 10, 9) ;
        Class cl = harry.getClass();
        System.out.println(cl.getName());
        Field f = cl.getDeclaredField("name");
        f.setAccessible(true);
        Object v = f.get(harry);
        System.out.println(v);
    }
}

