package ConnectPool;

import JDBCUtil.JDBCConfig;
import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 来使用连接池修改我们的工具类,其中配置类依然采用原来的config类
 *
 */


public class PoolUtil {

    private PoolUtil() {
    }

    private static JDBCConfig config = new JDBCConfig("connect.properties");
    private static BasicDataSource dataSource = new BasicDataSource();

    // 面向对象思想,如果返回接口对象,一般不返回具体类型,而是返回接口类型,方便多态调用
    //静态方法,返回一个设置好的连接池
    public static DataSource getSources() {
        dataSource.setPassword(config.getPassword());
        dataSource.setUsername(config.getUsername());
        dataSource.setDriverClassName(config.getDriver());
        dataSource.setUrl(config.getUrl());
        dataSource.setMaxActive(10);
        dataSource.setMinIdle(10);
        dataSource.setInitialSize(5);
        return dataSource;
    }


}
