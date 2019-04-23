package chapter5.extension;

/**
 * 初始化块的特殊方法：
 * 创建对象先分配内存，然后执行初始化
 *
 * 先执行初始化代码块和声明实例变量指定的初始值（这个是按照代码排列的顺序执行，而不是有指定顺序
 *
 */

public class InitTest {

    //初始化代码块
    {a = 6;}

    //声明部分，虽然写在初始化代码块下边，但是会先给a分配内存，所以初始代码块不会找不到变量
    int a = 9;
    //这个顺序的结果输出9


    //如果更换位置，输出6：
//    int a = 9;
//    {a = 6;}


    public static void main(String[] args) {
        System.out.println(new InitTest().a);

    }
}
