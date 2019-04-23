package chapter5.extension;

public class Student extends Person {

    private int age;

    private String name;

    private int length;

    private String hobby;

    private String game;

    public Student(int age, String name, int length, String hobby, String game) {
        super(age, name, length, hobby);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", hobby='" + hobby + '\'' +
                ", game='" + game + '\'' +
                '}';
    }

    @Override
    public String tellName() {
        return super.tellName();
    }

    @Override
    public int tellAge() {
        return super.tellAge();
    }

    @Override
    public String tellHobby() {
        super.tellAge();
        return super.tellHobby();
    }
}
