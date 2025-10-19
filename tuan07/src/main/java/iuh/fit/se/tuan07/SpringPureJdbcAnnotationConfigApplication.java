package iuh.fit.se.tuan07;

import iuh.fit.se.tuan07.config.AppConfig;
import iuh.fit.se.tuan07.dao.EmployeeDAO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class SpringPureJdbcAnnotationConfigApplication {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println("Annotation Config - Connection: " + dataSource.getConnection());

        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);

        System.out.println("=== Annotation Configuration Test ===");
        employeeDAO.getAll().forEach(System.out::println);
    }
}