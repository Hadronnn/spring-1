import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCTEST {
    public static void main(String[] args) throws SQLException {
        //初始化Spring的IOC容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        DataSource dataSource = (DataSource) context.getBean("dataSource");
        //根据类型获取Bean，要求Bean唯一
        DataSource dataSource = context.getBean(DataSource.class);
        System.out.println("dataSource = " + dataSource);
        Connection connection = dataSource.getConnection();
        System.out.println("connection = " + connection);


        connection.close();
        context.close();
    }
}
