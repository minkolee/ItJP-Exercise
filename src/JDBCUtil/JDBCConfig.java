package JDBCUtil;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * 把读入配置的部分移动到一个新的类,每次可以用一个配置文件new 一个新的config 对象,不同的config对象包含不同的配置
 */


public class JDBCConfig {

    private String driver;
    private String url;
    private String username;
    private String password;
    private String filename;

    JDBCConfig(String filename) {
        try {
            InputStream isn = JDBCUtil.class.getClassLoader().getResourceAsStream(filename);
            BufferedInputStream bis = new BufferedInputStream(isn);
            InputStreamReader isr = new InputStreamReader(bis, "GBK");
            Properties config = new Properties();
            config.load(isr);
            this.driver = config.getProperty("driver");
            this.url = config.getProperty("url");
            this.username = config.getProperty("username");
            this.password = config.getProperty("password");
        } catch (Exception ex) {
            throw new RuntimeException("加载配置类出错");
        }
    }


    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFilename() {
        return filename;
    }
}
