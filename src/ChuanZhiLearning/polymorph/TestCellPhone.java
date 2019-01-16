package ChuanZhiLearning.polymorph;

public class TestCellPhone {

    public static void main(String[] args) {
        Phone p1 = new Phone("MC", 666);

        OldPhone p2 = new OldPhone("WC", 777, 999);


        System.out.println(p1.id);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p2.id);
        System.out.println(p2.desk);

    }
}

class Phone {
    String name;
    int id;
     Phone() {
    }

    Phone(String name, int id) {
        this.name = name;
        this.id = id;
    }



    public void call() {
        System.out.println("Is calling");
    }

    public void sendMessage() {
        System.out.println("Message is sent");
    }
}



interface IPlay {
    void playGame();

}

class OldPhone extends Phone {
    int desk;

    OldPhone() {

    }

    OldPhone(String name, int id, int desk) {
        super();
        this.desk = desk;
    }
}

class NewPhone extends Phone implements IPlay {

    public void playGame() {
        System.out.println("Playing game.....");
    }
}