package learnjdbc;

import com.mysql.cj.xdevapi.Result;

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1 采用反射方式加载驱动类
        // 由于驱动类有静态代码块,加载的时候就会执行
        // 静态代码块的功能还需要学习一下

        Class.forName("com.mysql.cj.jdbc.Driver");


        // 2 获取数据库连接对象
        //static Connection getConnection 来自于java.sql的接口
        //报时区错误需要加上 参数 serverTimezone=UTC
        String url = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC";
        String username = "root";
        String password = "fflym0709";

        Connection con = DriverManager.getConnection(url, username, password);


        // 3 获取语句的执行者对象

        Statement state = con.createStatement();

//        System.out.println(state);

        // 4 执行操作SQL语句
        // int executeUpdate(String sql) 只能执行 insert delete update, 返回值表示成功操作多少行
        // 例子是执行INSERT
//        int row = state.executeUpdate("INSERT into goods(name,quantity) VALUES('Anathem',60) ");


        // 5 获取查询结果集
        // 是executeQuery(String sql)语句,返回的是一个ResultSet 接口对象

        ResultSet rs =  state.executeQuery("SELECT * FROM goods");
        System.out.println(rs);

        //rs有各种get方法,用来获取内容
        //有一个next()方法,其实是一个游标,一开始默认处于第一行之前,如果返回false,就表示之后再无数据
        //所以用循环来处理一列的全部数据

        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getInt("quantity"));
        }






        // 6 关闭资源,要将执行者对象和连接对象全部关闭
        state.close();
        con.close();

    }
}
