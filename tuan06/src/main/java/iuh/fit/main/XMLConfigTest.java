package iuh.fit.main;


import iuh.fit.models.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLConfigTest {
    public static void main(String[] args) {
        // Load Spring Container từ file XML
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Lấy bean Employee sử dụng Setter Injection
        Employee emp1 = (Employee) context.getBean("employee1");
        System.out.println("=== Setter Injection ===");
        System.out.println(emp1);

        // Lấy bean Employee sử dụng Constructor Injection
        Employee emp2 = (Employee) context.getBean("employee2");
        System.out.println("\n=== Constructor Injection ===");
        System.out.println(emp2);

        // Đóng context
        ((ClassPathXmlApplicationContext) context).close();
    }
}
