package LearnDBUtils;

import JDBCUtil.JDBCConfig;
import JDBCUtil.JDBCUtil;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 试验增删改查
 * insert delete update
 *
 * update(Connection con, String sql, Object...param)
 * param是占位符,SQL语句中可以用问号占位符
 *
 * 连接对象需要传递,就使用自定义的工具类即可
 *
 * 写三个方法用于测试执行语句
 *
 *
 * JavaBean就是一种类的统称,就是封装数据
 */

public class QueryRunnerTest {

    public static void main(String[] args) {
        // 使用自行编写的工具类创建连接给DBUtils
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con = JDBCUtil.getCon(config);
        System.out.println("连接对象是: "+con);
        System.out.println("————————————————————————————————————————————————");

//        insert(con, "AceCombat7", 99);
//        update(con, "Pillars", 100, 5);
//        delete(con, 5);



        //使用DBUtils关闭
        DbUtils.closeQuietly(con);
    }

    public static void insert(Connection con,String name, int quantity) {

        QueryRunner qr = new QueryRunner();

        try {
            //带参数的新增SQL语句
            int rows = qr.execute(con, "INSERT INTO goods(name,quantity) VALUES(?,?)", name, quantity);
            System.out.println("成功插入了"+rows+"行数据。");
        } catch (SQLException ex) {
            System.out.println(ex + "插入新数据失败");
        }

    }

    public static void update(Connection con, String name, int quantity, int id) {
        QueryRunner qr = new QueryRunner();

        try {
            //带参数的新增SQL语句
            int rows = qr.execute(con, "UPDATE goods SET name=?,quantity=?  WHERE id=?", name, quantity, id);
            System.out.println("成功修改了"+rows+"行数据。");
        } catch (SQLException ex) {
            System.out.println(ex + "修改新数据失败");
        }

    }

    public static void delete(Connection con, int id) {
        QueryRunner qr = new QueryRunner();

        try {
            //带参数的新增SQL语句
            int rows = qr.execute(con, "DELETE FROM goods WHERE id=?", id);
            System.out.println("成功删除了"+rows+"行数据。");
        } catch (SQLException ex) {
            System.out.println(ex + "删除数据失败");
        }

    }

}
