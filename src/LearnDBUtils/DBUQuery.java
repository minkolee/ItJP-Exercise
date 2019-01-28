package LearnDBUtils;

import JDBCUtil.JDBCConfig;
import JDBCUtil.JDBCUtil;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import javax.naming.event.ObjectChangeListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

/**
 * 试过了增删改,然后用查
 * 查询需要使用QueryRunner的query方法,然后可以带一个ResultHandler对象
 *
 *
 */

public class DBUQuery {
    // 使用自行编写的工具类创建连接给DBUtils


    public static void main(String[] args) {

        arrayListTest();
        // 第一种方式,ArrayHandler,返回一个数组
    }

    public static void arrayTest(){
        // 第一种方式,ArrayHandler,返回一个数组
        QueryRunner qr = new QueryRunner();
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con = JDBCUtil.getCon(config);
        try {
            Object[] objs = qr.query(con, "SELECT * FROM goods", new ArrayHandler());
            System.out.println(Arrays.toString(objs));
        } catch (SQLException ex) {
            System.out.println(ex + "查询失败");
        } finally {
            DbUtils.closeQuietly(con);
        }
    }

    public static void arrayListTest(){
        // 第二种方式,返回列表,是一个列表,每个元素是一个Object数组
        QueryRunner qr = new QueryRunner();
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con = JDBCUtil.getCon(config);
        try {
            List<Object[]> objs = qr.query(con, "SELECT * FROM goods", new ArrayListHandler());
            System.out.println(objs);
        } catch (SQLException ex) {
            System.out.println(ex + "查询失败");
        } finally {
            DbUtils.closeQuietly(con);
        }
    }
}
