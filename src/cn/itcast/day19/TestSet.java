package cn.itcast.day19;

import java.util.HashSet;
import java.util.LinkedList;

public class TestSet {

    public static void main(String[] args) {
        Person p1 = new Person("Jenny", 34);
        Person p2 = new Person("Cony", 4);
        Person p3 = new Person("Cony", 4);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p2==p3);
        System.out.println(p2.equals(p3));

        HashSet<Person> list =new HashSet<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);

        System.out.println(list);
    }
}

class Person{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Person person) {
        if (this.age == person.age && this.name.equals(person.name)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return 1;
    }


}