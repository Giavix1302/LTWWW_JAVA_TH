package iuh.fit.se.tuan07.repository;

import iuh.fit.se.tuan07.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Spring Data JPA sẽ tự động implement các method cơ bản
}