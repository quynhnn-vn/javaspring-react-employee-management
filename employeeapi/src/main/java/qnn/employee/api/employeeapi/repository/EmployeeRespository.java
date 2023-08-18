package qnn.employee.api.employeeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import qnn.employee.api.employeeapi.model.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {
    
}
