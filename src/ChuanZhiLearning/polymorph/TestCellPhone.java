package ChuanZhiLearning.polymorph;

public class TestCellPhone {

    public static void main(String[] args) {
        NewPhone n1 = new NewPhone();
        OldPhone n2 = new OldPhone();

        n1.call();
        n1.sendMessage();
        n2.call();
        n2.sendMessage();
        n1.playGame();

    }




}






class Phone {

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

}

class NewPhone extends Phone implements IPlay {

    public void playGame() {
        System.out.println("Playing game.....");
    }
}