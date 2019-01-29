package ConnectPool;

import JDBCUtil.JDBCConfig;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbutils.DbUtils;

import java.sql.*;

/**
 * Javax.sql.DataSource是Java 为连接池提供的标准接口
 * 有一个重写的getConnection()方法,可以替代DriverManager的静态方法用于获得连接对象
 * 这里用Apache common 的DBCP池子,还需要一个Pool包(API调用师了)
 * <p>
 * 这里就用连接池来替换原来的获取连接的部分
 * <p>
 * BasicDataSource就是DataSource的实现类
 */


public class LearnCPool {
    public static void main(String[] args) {

        // 先用封装的类启动连接
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con;

        // 原来是使用工具类,其中的工具类是 DriverManager
        // Connection con = JDBCUtil.getCon(config);
        // 使用连接池来重写编写获取连接的方式


        // 1 查看API可以知道,有空参构造器先构造出来一个BasicDataSource对象

        BasicDataSource sources = new BasicDataSource();

        // 2 用相关的set方法给连接池设置好连接所需的驱动,地址,用户名和密码
        // 这四个是在调用连接的时候必须预先设置的,否则无法获取连接

        sources.setDriverClassName(config.getDriver());
        sources.setUrl(config.getUrl());
        sources.setUsername(config.getUsername());
        sources.setPassword(config.getPassword());

        // 还有扩展设置,可以不配置,类会自动默认做一些配置
        // maxActive	最大连接数量,一共可以有多少个链接
        // minIdle	最小空闲连接,最小空闲链接指的是没有在用的连接,假如max 为30 用了10个,设置该属性为10个,则只有 20个活动的连接,另外10个不
        // 设置.如果设置比较大,会自动新建新的连接,设置为0就不会新建连接
        // maxIdle 	最大空闲连接
        // initialSize	初始化连接的数量,初始化启动的时候放几个连接
        try {
            // 3 使用.getConnection()方法获取一个连接
            con = sources.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            pst = con.prepareStatement("SELECT  * FROM  goods");
            rs = pst.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getInt("id"));
                System.out.print('|');
                System.out.print(rs.getString("name"));
                System.out.print('|');
                System.out.println(rs.getInt("quantity"));
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex + "数据库检索失败");
        } finally {
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(pst);
        // 这里的close 实际上就是将连接放回了连接池
            DbUtils.closeQuietly(con);
        }
    }
}
