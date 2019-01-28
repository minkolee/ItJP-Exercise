package Wake2.Wake;

/**
 * 加一个标志位flag
 *
 * 如果 flag 为真,表示赋值完成
 * 如果 flag 为假,表示输出完成
 *
 * 各个线程通过标志位进行操作
 *
 *
 */

public class Resource {

    public String name;
    public String sex;
    boolean flag = false;
}
