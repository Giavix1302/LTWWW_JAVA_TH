package iuh.fit.main;

import iuh.fit.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationConfigTest {
    public static void main(String[] args) {
        // Load Spring Container với annotation config
        ApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-config.xml");

        // Lấy bean Employee (tự động inject Address)
        Employee emp = context.getBean(Employee.class);
        System.out.println("=== Annotation-Based Configuration ===");
        System.out.println(emp);

        ((ClassPathXmlApplicationContext) context).close();
    }
}