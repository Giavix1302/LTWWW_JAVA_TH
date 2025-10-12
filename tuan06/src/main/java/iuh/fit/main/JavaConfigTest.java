package iuh.fit.main;


import iuh.fit.config.AppConfig;
import iuh.fit.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        // Load Spring Container từ Java Config
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Lấy bean Employee với Setter Injection
        Employee emp1 = context.getBean("employee", Employee.class);
        System.out.println("=== Java-Based Config (Setter) ===");
        System.out.println(emp1);

        // Lấy bean Employee với Constructor Injection
        Employee emp2 = context.getBean("employeeConstructor", Employee.class);
        System.out.println("\n=== Java-Based Config (Constructor) ===");
        System.out.println(emp2);

        ((AnnotationConfigApplicationContext) context).close();
    }
}