package learnjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 通过预编译来解决注入问题
 * 使用Statement接口的一个子接口PreparedStatement
 * 通过参数化的形式来使用SQL 语句
 */

public class PreparedSDemo {

    public static void main(String[] args) throws Exception {
        // 反射载入数据库驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 建立连接对象
        String url = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=UTC";
        String username = "root";
        String password = "fflym0709";
        Connection con = DriverManager.getConnection(url, username, password);


        // **** 这里使用Prepared SQL
        // 用?作为占位符
        String sql = "SELECT * FROM goods WHERE name=? OR quantity=?";
        // 得到预编译对象
        PreparedStatement pst = con.prepareStatement(sql);
        // 然后用合理的方式得到参数,使用setObject()方法设置参数
        pst.setObject(1,"Biohazard2");
        pst.setObject(2,30);



        // 之后执行查询,由于已经编译好,而且传入了参数,所以无需加SQL语句,直接执行查询即可
        // 这样就可以解决注入问题,输入的字符一定是作为参数解释,而不是像SQL语句一样.
        ResultSet rs = pst.executeQuery();


        while (rs.next()) {
            System.out.print(rs.getInt("id")+"|");
            System.out.print(rs.getString("name")+"|");
            System.out.print(rs.getInt("quantity"));
            System.out.println();
        }

    }


}
