package JDBCUtil;

import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 * 为了简化代码,自定义一个自己的连接MySQL的工具类,由于是工具类,先private构造方法,禁止new 对象
 * 通过Properties类来读出配置,然后获得链接,今后就修改配置文件就可以了
 * 但要注意,这个时候的src写死了,
 * 必须通过加载类才行,这是一个关键,由于正式的文件会被放到bin目录下去
 * 加载文件的方法一定要注意,这里就是动态加载了
 */


public class JDBCUtil {
    private static final Connection connection;
    private JDBCUtil() {
    }

    static {
        try {
            // 原来流对象打开配置文件然后用Properties载入,写死了路径
//            FileInputStream fis = new FileInputStream("src\\connect.properties");

            //采用类的加载器来读入文件,这样在src根目录下的文件就会被放到out或者bin目录的同样位置的路径下,就可以读取到了,无需写死路径
            // 这个本质上还是反射原理,可以用来加载任意文件.

            InputStream isn = JDBCUtil.class.getClassLoader().getResourceAsStream("connect.properties");
            BufferedInputStream bis = new BufferedInputStream(isn);
            InputStreamReader isr = new InputStreamReader(bis, "GBK");
            Properties config = new Properties();
            config.load(isr);






            // 用读入的属性来配置文件
            Class.forName(config.getProperty("driver"));
            String url = config.getProperty("url");
            String username = config.getProperty("username");
            String password =  config.getProperty("password");
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception ex) {
            System.out.println(ex + "数据库连接失败");
            throw new RuntimeException("数据连接失败");
        }

    }

    public static Connection getCon() {
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
