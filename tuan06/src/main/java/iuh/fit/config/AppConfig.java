package iuh.fit.config;


import iuh.fit.models.Address;
import iuh.fit.models.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        return new Address("Can Tho", "CT", "Vietnam");
    }

    @Bean
    public Employee employee() {
        Employee emp = new Employee();
        emp.setId(4);
        emp.setName("Pham Thi D");
        emp.setAddress(address());  // Inject dependency
        return emp;
    }

    // Hoặc sử dụng Constructor Injection
    @Bean
    public Employee employeeConstructor() {
        return new Employee(5, "Hoang Van E", address());
    }
}