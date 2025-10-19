package iuh.fit.se.tuan07;


import iuh.fit.se.tuan07.dao.EmployeeDAO;
import iuh.fit.se.tuan07.entity.Employee;
import iuh.fit.se.tuan07.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tuan07Application implements CommandLineRunner {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private EmployeeRepository employeeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tuan07Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=== Testing JDBC DAO ===");
        testJdbcDAO();

        System.out.println("\n=== Testing Spring Data JPA ===");
        testSpringDataJPA();
    }

    private void testJdbcDAO() {
        // Test JDBC DAO
        Employee employee = new Employee("Nguyen Van A", "Super Admin");
        employeeDAO.save(employee);

        System.out.println("All employees (JDBC):");
        employeeDAO.getAll().forEach(System.out::println);

        Employee employee2 = employeeDAO.getById(1);
        System.out.println("Employee by ID 1: " + employee2);
    }

    private void testSpringDataJPA() {
        // Test Spring Data JPA
        Employee employee = new Employee("Tran Van B", "Manager");
        employeeRepository.save(employee);

        System.out.println("All employees (JPA):");
        employeeRepository.findAll().forEach(System.out::println);

        Employee foundEmployee = employeeRepository.findById(1).orElse(null);
        System.out.println("Employee found by ID 1: " + foundEmployee);
    }
}