package chapter5.extension;

public class Person {

    private int age;

    private String name;

    private int length;

    private String hobby;


    Person(int age, String name, int length, String hobby) {
        this.age = age;
        this.name = name;
        this.length = length;
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", hobby='" + hobby + '\'' +
                '}';
    }

    String tellName() {
        System.out.println("My name is " + name);
        return this.name;
    }

    int tellAge() {
        System.out.println("My age is " + age);
        return this.age;
    }

    String tellHobby() {
        System.out.println("My hobby is " + hobby);
        return this.hobby;
    }


}
