package cn.itcast.day23;


import java.io.*;

public class TestSerialize  {

    public static void main(String[] args) throws Exception {
//        ss();
        read();

    }

    public static void ss() throws Exception {
        Person pp = new Person("Jenny",33);

        FileOutputStream fos = new FileOutputStream("D:\\jenny.object");
        BufferedOutputStream out = new BufferedOutputStream(fos);
        OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");

        // 由于写object一定是写字节,所以不能使用转换流,直接使用字节基础流或者字节缓冲流都可以

        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(new Person("cony",26));
        oos.close();
    }

    public static void read() throws Exception {

        FileInputStream fis = new FileInputStream("D:\\jenny.object");
        BufferedInputStream bis = new BufferedInputStream(fis);

        // 由于写object一定是写字节,所以不能使用转换流,直接使用字节基础流或者字节缓冲流都可以

        ObjectInputStream ois = new ObjectInputStream(bis);


        // 这里要用Object接受,因为readObject返回的是Object类型,不知道是什么具体类型
        Object jenny = ois.readObject();


        System.out.println(jenny);
    }


}

