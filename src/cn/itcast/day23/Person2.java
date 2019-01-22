package cn.itcast.day23;

import java.io.Serializable;

public class Person2 implements Serializable {
    private String name;
    private static int age = 22;
    public Person2() {
        super();

    }

    public Person2(String name, int age) {

        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
