package cn.itcast.day20;

import java.util.Arrays;

import static java.lang.System.out; //最末尾必须是一个静态成员
import static java.util.Arrays.sort;

/**
 * JDK 1.5的新特性,静态导入,即直接导入静态方法,为的是减少代码量,但其实用处有限而且降低了可读性
 */
public class StaticImportDemo {
    public static void main(String[] args) {
        Person[] persons = new Person[10];
        Person p1 = new Person("Cony", 4);
        Person p2 = new Person("Jenny", 12);
        Person p3 = new Person("Minko", 15);

        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;

        out.println(Arrays.toString(persons));
        Demo<Double> d = new Demo<Double>();

        d.method(3.4);

        d.staticMethod(true);

        d.show("haha");

        d.print(new Integer(4));
    }

}

class Person {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

}


class Demo<T> {
    public void method(T t) {
        System.out.println("method :" + t);
    }

    public static <W> void staticMethod(W w) {
        System.out.println("staticMethod :" + w);
    }

    public <K> void show(K k) {
        System.out.println("Show :" + k);
    }

    public <Q> void print(Q q) {
        System.out.println("Print :" + q);
    }
}
