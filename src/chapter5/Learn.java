package chapter5;

import chapter5.extension.Student;

/**
 * 继承遵循两小一大：
 * 子类方法比父类返回类型相同或者小
 * 子类方法抛出异常和父类相同或者小
 * 子类方法访问权限和父类相同或者大
 * 子类方法和父类方法要么都是静态方法，要么都是实例方法
 * 重载 overload
 * 重写 override
 *
 * 继承破坏封装
 * 不要在父类的构造器中使用可能被子类重写的方法
 * 由于一旦调用，隐式参数都是子类实例，因此调用的是子类重写后的方法，会引起错误
 *
 * 使用final修饰类，就无法被继承了
 * 再配上private的构造器，该类就无法被创造实例，可以提供静态方法用于创建实例（工厂模式），或者创建好一个实例供引用（单例模式）
 *
 *
 * 判断何时使用集成
 * 1 子类需要扩展属性，而不是改变属性
 * 2 子类有独特的方法（行为）
 *
 * 类复用除了继承之外，还可以使用组合，即把类当做成员变量，组成出更大的功能。
 *
 *
 */

public class Learn {

    public static void main(String[] args) {

        Student ss = new Student(18, "cony", 110, "mathmetic", "clay");

        System.out.println(ss);

        ss.tellHobby();

    }
}
