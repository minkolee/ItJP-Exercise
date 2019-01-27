package learnjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
 * 参数化增删改查,这里实现了一个输入商品名称和数量,然后操作数据库的方式.
 * 可见JDBC还比较原始,使用SQL数据直接操作,然后将对应数据类型转换到SQL语句中再重新执行
 * 估计后来一定会有ORM的内容.
 */

public class PreparedUpdateDemo {

    public static void main(String[] args) throws Exception {
        // 反射载入数据库驱动
        Scanner input = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 建立连接对象
        String url = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC";
        String username = "root";
        String password = "fflym0709";
        Connection con = DriverManager.getConnection(url, username, password);


        // **** 这里使用Prepared SQL
        // 用?作为占位符,这里不再是查询语句,而是增删改语句
        String sql = "INSERT Into goods(name,quantity) values(?,?)";
        String sq2 = "SELECT * FROM goods";

        // 得到预编译对象
        PreparedStatement pst = con.prepareStatement(sql);
        PreparedStatement pstq = con.prepareStatement(sq2);
        // 然后用合理的方式得到参数,使用setObject()方法设置参数
        System.out.print("请输入商品名称:");
        String name = input.nextLine();
        System.out.print("请输入商品数量:");
        int quant = input.nextInt();

        pst.setObject(1,name);
        pst.setObject(2, quant);

        // 这里改用执行Update方法,不是查询方法
        int rs = pst.executeUpdate();

        ResultSet rs2 = pstq.executeQuery();


        while (rs2.next()) {
            System.out.print(rs2.getInt("id")+"|");
            System.out.print(rs2.getString("name")+"|");
            System.out.print(rs2.getInt("quantity"));
            System.out.println();
        }

    }


}
