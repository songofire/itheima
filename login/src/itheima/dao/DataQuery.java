package itheima.dao;

import itheima.domain.User;
import itheima.utils.DataSourcesUtils;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class DataQuery{
    public User userQuery(User user){
        //连接数据库作比较
        try {
            DataSource ds = DataSourcesUtils.getDataSources();
            JdbcTemplate jet = new JdbcTemplate(ds);
            user = jet.queryForObject("select * from login where username=? and password = ?", new BeanPropertyRowMapper<User>(User.class), user.getUsername(), user.getPassword());
        }
         catch (Exception e) {
            user =null;
            e.printStackTrace();
        }
        return user;
    }
}
