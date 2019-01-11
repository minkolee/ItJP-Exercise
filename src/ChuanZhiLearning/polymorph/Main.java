package ChuanZhiLearning.polymorph;

// 成员变量编译的时候参考引用类型即父类 Father 类型,运行的时候,依然是找父类中的变量


//成员方法编译的时候看父类,使用的时候看子类
// 也就是说需要实现多态的时候,父类一定要有方法,子类需要重写该方法
public class Main {
    public static void main(String[] args) {
        Father fa = new Son();

        System.out.println(fa.i);
        fa.show();

    }
}
