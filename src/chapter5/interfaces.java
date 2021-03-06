package chapter5;

/**
 * 接口原来在Java 8之前都是抽象方法
 * Java 8 之后增减了默认方法，可以直接把实现写在接口里
 * 接口定义的是一组行为，这组行为满足与外界交流的通道
 * 接口可以有多个父接口，但只能继承接口，不能继承类
 * 接口修饰符可以是public或者不写
 * 接口内的方法的修饰符写不写都是public
 *
 * 接口里没有成员变量，只能包含静态常量，方法只能是静态方法，抽象方法或者默认方法，以及内部类的定义
 * 接口里的静态常量自动是public static final，不管写不写
 * 只要是没有方法体的方法，一定是public abstract
 * 有方法体的方法，要么是静态方法，要么是默认方法
 * 默认方法用 default 修饰，必须有方法体。自动是public，不管写不写。必须通过实例调用
 * 静态方法用 static 修饰，必须有方法体，自动是public，通过接口调用
 * 接口里的变量全部是类变量，通过接口可以调用
 *
 */

public class interfaces {
}
