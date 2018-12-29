package ijp.chapter10;

/**
 * super 调用父类构造方法和调用父类方法
 * 如果构造函数没有写super,会隐式调用父类的super()
 * 所以父类一般需要一个无参构造方法,否则子类无法正常隐式构造
 * 重写是指方法签名完全一致.如果方法签名不一致,会到父类中寻找,实际上是方法重载.
 * 重写可以使用@override来标注,这样可以避免错误
 * Java中所有类都继承自java.lang.Object类该类的所有域和方法都可以被其他类使用
 * Object中有一个toString()方法
 *
 *
 * 动态绑定
 *
 *
 * 声明类型和实例类型
 *
 * Object o = new Geo()
 *
 * 其中Ojbect 是声明类型
 * Geo是实例类型,实例类型必须是 声明类型或者声明类型的子类型
 *
 * 这里别和下边混,如果有自定义方法,声明类型里没有,会报错,实际上还是声明类型重要.
 *
 * 查找方法和属性的时候,按照继承关系一级一级向上查找,不会查找子类型的方法
 *
 *
 * 转换引用变量类型,如果是从父类转子类,可以不用声明,如果子类转父类(确实那个对象也是父类的对象),需要显式用类型名转换
 * 如何确定可以转换,可以采用instanceOf 运算符
 * 注意如果只属于实例的方法,不进行转换就会出错,IDE会自动完成
 *
 *
 * 可见在继承关系中,声明对象的类型很重要,一般是可以用父类对象进行声明,但在操作具体方法的时候,编译器需要具体知道是哪种类型,所以要进行类型转换
 *
 *
 *
 * equals 测试两个对象是否相等=即指向同一个内存区域
 *
 * 376页的修饰符要注意,如果只想从子类可以访问,用protect,介于什么都不加和完全访问之间,377页的图也要注意
 *
 * final + 类,类不可作为父类被继承和扩展
 * final + 方法,方法不能够被子类重写
 *
 */


public class chapter10note {
    public static void main(String[] args) {
        AB ab = new AB();
        AB c =  ab.showAB();
        c.test();
    }
}

class AB extends BC {
    AB showAB() {
        System.out.println("This is AB");
        return this;
    }

    public void test() {
        System.out.println("THs");
    }
}

class BC {
    public void showBC() {
        System.out.println("This is BC");
    }
}