package ConnectPool;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * 今后使用DBUtils的步骤就是:
 * 1 创建连接池并获取连接对象
 * 2 直接使用QueryRunner方法查询得到包装好的结果集(推荐使用Bean)
 * 3 处理结果
 *
 *
 * 这样比原版的注册驱动,配置URL,拿到连接对象,用Statement操作,之后使用ResultSet得到结果,再取出结果进行遍历要方便很多
 */


public class TestPoolUtil {

    public static void main(String[] args) {

        DataSource sources = PoolUtil.getSources();
        Connection con;
        try {
            // 3 使用.getConnection()方法获取一个连接
            con = sources.getConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }

        QueryRunner qr = new QueryRunner();

        try {
            List<Object[]> list = qr.query(con, "SELECT  * FROM  goods", new ArrayListHandler());
            System.out.println(list);

            for (Object[] arrs : list) {
                System.out.println(Arrays.toString(arrs));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException("数据库查询错误");
        } finally {
            DbUtils.closeQuietly(con);
        }
    }
}
