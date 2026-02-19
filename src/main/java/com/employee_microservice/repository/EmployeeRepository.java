package com.employee_microservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_microservice.model.entitys.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  Optional<Employee> findByIdEmployee(Long id);
}
