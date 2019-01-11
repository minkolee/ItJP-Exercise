package ChuanZhiLearning.day11;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl my = new MyInterfaceImpl();
        my.function();

        System.out.println(Inter.b);
        System.out.println(my.b);


    }
}
