package iuh.fit.se.tuan07;

import iuh.fit.se.tuan07.dao.EmployeeDAO;
import iuh.fit.se.tuan07.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

public class SpringPureJdbcXmlConfigApplication {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("databaseConfig.xml");

        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println("XML Config - Connection: " + dataSource.getConnection());

        EmployeeDAO employeeDAO = context.getBean("employeeDAO", EmployeeDAO.class);

        System.out.println("=== XML Configuration Test ===");
        employeeDAO.getAll().forEach(System.out::println);
    }
}