package iuh.fit.se.tuan07.dao;

import iuh.fit.se.tuan07.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    void save(Employee employee);
    void update(Employee employee);
    void deleteById(int id);
    Employee getById(int id);
    List<Employee> getAll();
}
