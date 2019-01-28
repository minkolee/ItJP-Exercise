package JDBCUtil;

import java.sql.*;

/**
 * 为了简化代码,自定义一个自己的连接MySQL的工具类,由于是工具类,先private构造方法,禁止new 对象
 * 通过Properties类来读出配置,然后获得链接,今后就修改配置文件就可以了
 * 但要注意,这个时候的src写死了,
 * 必须通过加载类才行,这是一个关键,由于正式的文件会被放到bin目录下去
 * 加载文件的方法一定要注意,这里就是动态加载了
 */


public class JDBCUtil {

    private JDBCUtil() {
    }


    public static Connection getCon(JDBCConfig config) {
        Connection connection = null;
        try {
            Class.forName(config.getDriver());
            String url = config.getUrl();
            String username = config.getUsername();
            String password = config.getPassword();
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.out.println(ex + "数据库连接失败");
            throw new RuntimeException("数据连接失败");
        }
        return connection;
    }

    public static void close(Connection con, PreparedStatement pst, ResultSet resultSet) {
        if (con == null) {
            try {
                con.close();
            } catch (Exception sql) {
                System.out.println(sql + "连接关闭失败");
            }
        }

        if (pst == null) {
            try {
                pst.close();
            } catch (Exception sql) {
                System.out.println(sql + "Statement关闭失败");
            }
        }

        if (resultSet == null) {
            try {
                resultSet.close();
            } catch (Exception sql) {
                System.out.println(sql + "结果集关闭失败");
            }
        }
    }
}
