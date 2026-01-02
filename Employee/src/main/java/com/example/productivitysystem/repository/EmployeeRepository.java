package com.example.productivitysystem.repository;

import com.example.productivitysystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
