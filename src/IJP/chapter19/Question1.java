package ijp.chapter19;

/**
 * 由于使用数组,不得已创建了一个Object 数组,用来存储所有的对象,然后将泛型用在取出类型时候的转型上.
 * 使用一个索引记录数组的最后一个实际元素
 * 可见这个数组对于非null元素的支持不好,因为pop的时候会弹出元素并默认用nul填充
 * 所以在push的时候对于null元素报错
 * 在数组满的时候新建数组然后使用System.arraycopy来复制一个新数组
 * 没有实现数组的缩短.
 *
 */

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        GenericStack<String> gs = new GenericStack<>();
        System.out.println(gs.isEmpty());

        gs.push("Cony");
        gs.push("Minko");
        gs.push("Jenny");
        gs.push("lajs");

        System.out.println(Arrays.toString(gs.list));
        System.out.println(gs.isFull());
        System.out.println(gs.size);

        GenericStack<Integer> gsi = new GenericStack<>();

        gsi.push(7);
        gsi.push(6);
        gsi.push(5);
        gsi.push(4);
        gsi.push(3);
        gsi.push(2);
        gsi.push(1);
        gsi.push(0);
        gsi.push(-1);
        System.out.println(Arrays.toString(gsi.list));
        System.out.println(gsi.size);
        System.out.println(gsi.pop());
        System.out.println(gsi.pop());
        System.out.println(gsi.pop());
        System.out.println(gsi.isEmpty());
        System.out.println(gsi.isFull());
    }
}

class GenericStack<E>{
    public Object[] list = new Object[4];
    public int size = 0;

    public int getSize() {
        return size;
    }

    public E peek() {
        return (E) (list[size - 1]);
    }

    public void push(E o) {
        if (o == null) {
            throw new IllegalArgumentException("null");
        }

        if (isFull()) {
            Object[] temp = new Object[list.length * 2];
            System.arraycopy(list, 0, temp, 0, list.length);
            list = temp;
        }
        list[size] = o;
        size++;
    }

    public boolean isFull() {
        return size == list.length;
    }

    public E pop() {
        if (size == 0) {
            System.out.println("Array is Empty");
            return null;
        } else {
            E temp = (E) list[size - 1];
            list[size - 1] = null;
            size--;
            return temp;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
