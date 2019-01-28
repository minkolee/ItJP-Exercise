package JDBCUtil;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * 将结果存放的到一个ArrayList中,使用对象化的数据库结果方式
 * 这是一个ORM雏形
 *
 *
 */


public class TestJDBCUtil {

    public static void main(String[] args) throws Exception {
        //生成一个指定文件的配置类
        JDBCConfig config = new JDBCConfig("connect.properties");

        // 将该类传给静态工具,获得一个该配置的数据库连接
        Connection con = JDBCUtil.getCon(config);


        //下边都是正常使用该链接进行查询
        PreparedStatement pst = con.prepareStatement("SELECT * FROM goods");
        ResultSet rs = pst.executeQuery();


        //新建集合
        ArrayList<Goods> goods =new ArrayList<Goods>();


        //将查询结果集中的每一行数据,生成一个Goods对象,然后装到集合中去
        while (rs.next()) {
            goods.add(new Goods(rs.getInt("id"), rs.getString("name"), rs.getInt("quantity")));
        }

        //遍历集合
        for (Goods g : goods) {
            System.out.println(g);
        }

        JDBCUtil.close(con, pst, rs);
    }
}
