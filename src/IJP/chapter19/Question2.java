package ijp.chapter19;

/**
 * 继承泛型类的时候 的写法 class MyGenericStack<E> extends ArrayList<E> 两个参数要一致
 * 继承的时候还能扩展继承的类型
 * 如果父类的泛型指定了类型,子类就继承了那个类型
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyGenericStack<String> mgs = new MyGenericStack<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Input a string: ");
            mgs.add(input.nextLine());
        }

        for (int j = 0; j < 5; j++) {
            System.out.println(mgs.pop());
        }
    }

}


class MyGenericStack<E> extends ArrayList<E> {
    private int getSize() {
        return this.size();
    }

    public E peek() {
        return (E) this.get(getSize() - 1);
    }

    public void push(E o) {
        this.add(o);
    }

    public E pop() {
        E o = (E) this.get(getSize() - 1);
        this.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }


}