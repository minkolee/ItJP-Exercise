package ChuanZhiLearning.day11;

/**
 * 抽象类内部可以定义具体方法
 * 接口内部不能定义任何带有方法体的方法
 * 无法定义普通的成员变量
 * 接口自动是public
 * 其中的方法也自动是public,可以省略
 * 定义抽象方法是固定格式: public abstract 返回值 方法名字(参数列表);
 * 由于固定了权限,可以将 public 和 abstract 省略
 * 此时并不是默认权限,而依然还是 public abstract 权限

 */

public interface Inter {
    //抽象方法
    public abstract void function();

    // 成员变量不是普通的带有访问控制符的变量
    // 必须定义为常量

    // 即使这么写,a也是常量,而不是变量,自动将其固定
    int a = 1;
    // 实际上是:
    public static final int b = 1;

}
