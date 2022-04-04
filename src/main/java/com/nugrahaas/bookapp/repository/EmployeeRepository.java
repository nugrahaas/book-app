package com.nugrahaas.bookapp.repository;

import com.nugrahaas.bookapp.employee.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {
    void saveEmployee(Employee employee);
}
