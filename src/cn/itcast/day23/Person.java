package cn.itcast.day23;

import java.io.Serializable;

public class Person implements Serializable {
    static final long serialVersionUID = 6076269491458112476L;
    private String name;
    public static int age;
    public Person() {
        super();

    }
    public Person(String name, int age) {
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
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
