package ReflectLearn;

import java.io.IOException;

/**
 * 每个类都被虚拟机加载进内存,放在了方法区当中
 * 然后为这个类创建一个Class对象,由虚拟机创建,这个对象实际上不是我们的源代码(源代码也不会直接运行),而是编译后的.class文件对象,也叫作字节码对象
 * 每个类只要参与运行,就会有100个对应的Class对象
 * 这些对象不能够由程序员控制,但是可以操作
 *
 * 加载
 * 就是指将class文件读入内存，并为之创建一个Class对象。
 * 任何类被使用时系统都会建立一个Class对象
 *
 * 连接
 * 验证 是否有正确的内部结构，并和其他类协调一致
 * 准备 负责为类的静态成员分配内存，并设置默认初始化值
 * 解析 将类的二进制数据中的符号引用替换为直接引用
 *
 * 初始化
 * 就是我们以前讲过的初始化步骤
 *
 * java.lang.Class类就是描述Class对象的类
 *
 * 获取class对象的三种方式:
 * 1 通过object的getObject()方法,IDE不推荐这个方法
 * 2 Person.class 直接通过类名的这个属性
 * 3 Class.forName("类名")
 */

public class ReflectDemo {

    public static void main(String[] args) throws Exception {

        // 1
        Class person = Person.class;
        System.out.println(person);

        // 2
        Class person1 = new Person().getClass();
        System.out.println(person==person1);

        // 3 直接写字符串找不到,类名不是Person,要写全名,要带包名
        Class person2 = Class.forName("ReflectLearn.Person");
        System.out.println(person2==person1);



    }
}
