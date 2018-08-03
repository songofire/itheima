package itheima.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.util.Properties;

public class DataSourcesUtils {
    public static DataSource getDataSources() throws Exception {
        String path = DataSourcesUtils.class.getResource("druid.properties").getPath();
        FileInputStream fis = new FileInputStream(path);
        Properties pp = new Properties();
        pp.load(fis);
        DataSource ds = DruidDataSourceFactory.createDataSource(pp);
        return ds;
    }
}
