package LearnDBUtils;

import JDBCUtil.JDBCConfig;
import JDBCUtil.JDBCUtil;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;

import java.sql.SQLException;
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

//        arrayTest();
//        arrayListTest();
//        bean();
//        beanList();
//        column();
        scalar();

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

            for (Object[] ob : objs) {
                System.out.println(Arrays.toString(ob));
            }

        } catch (SQLException ex) {
            System.out.println(ex + "查询失败");
        } finally {
            DbUtils.closeQuietly(con);
        }
    }

    public static void bean() {
        // 第三种,单个Bean类型对象
        QueryRunner qr = new QueryRunner();
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con = JDBCUtil.getCon(config);
        try {
            // bean方法的Class <T>指的是传一个类的类文件对象,需要用.class属性来获取,泛型则是返回的类型,就是那个Bean类型
            Goods objs = qr.query(con, "SELECT * FROM goods", new BeanHandler<Goods>(Goods.class));
            System.out.print(objs);


        } catch (SQLException ex) {
            System.out.println(ex + "查询失败");
        } finally {
            DbUtils.closeQuietly(con);
        }

    }

    public static void beanList() {
        // 第四种,返回的是一个List集合,每个元素是Bean对象
        QueryRunner qr = new QueryRunner();
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con = JDBCUtil.getCon(config);
        try {
            // bean方法的Class <T>指的是传一个类的类文件对象,需要用.class属性来获取,泛型则是返回的类型,就是那个Bean类型
            List<Goods> objs = qr.query(con, "SELECT * FROM goods", new BeanListHandler<Goods>(Goods.class));
            System.out.print(objs);


        } catch (SQLException ex) {
            System.out.println(ex + "查询失败");
        } finally {
            DbUtils.closeQuietly(con);
        }
    }

    public static void column() {
        // 第四种,返回的是一个List集合,每个元素是Bean对象
        QueryRunner qr = new QueryRunner();
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con = JDBCUtil.getCon(config);
        try {
            // bean方法的Class <T>指的是传一个类的类文件对象,需要用.class属性来获取,泛型则是返回的类型,就是那个Bean类型
            List<Object> objs = qr.query(con, "SELECT name FROM goods", new ColumnListHandler<Object>());
            System.out.print(objs);


        } catch (SQLException ex) {
            System.out.println(ex + "查询失败");
        } finally {
            DbUtils.closeQuietly(con);
        }
    }

    public static void scalar() {
        // 第四种,返回的是一个List集合,每个元素是Bean对象
        QueryRunner qr = new QueryRunner();
        JDBCConfig config = new JDBCConfig("connect.properties");
        Connection con = JDBCUtil.getCon(config);
        try {
            // bean方法的Class <T>指的是传一个类的类文件对象,需要用.class属性来获取,泛型则是返回的类型,就是那个Bean类型
            long objs = qr.query(con, "SELECT count(*) FROM goods", new ScalarHandler<Long>());
            System.out.print(objs);


        } catch (SQLException ex) {
            System.out.println(ex + "查询失败");
        } finally {
            DbUtils.closeQuietly(con);
        }
    }

    // MAP的与此类似

}
