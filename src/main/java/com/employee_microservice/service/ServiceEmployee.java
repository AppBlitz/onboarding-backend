package com.employee_microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_microservice.model.dto.EmployeeDtoRequest;
import com.employee_microservice.model.dto.EmployeeDtoResponse;
import com.employee_microservice.model.entitys.Employee;
import com.employee_microservice.repository.EmployeeRepository;
import com.employee_microservice.service.intefacesService.interfaceEmployee;

@Service
public class ServiceEmployee implements interfaceEmployee {

  @Autowired
  EmployeeRepository Employeerepository;

  @Override
  public EmployeeDtoResponse getEmployeeForID(Long id) {
    return null;
  }

  @Override
  public Employee saveEmployee(EmployeeDtoRequest employeeDto) {
    return null;
  }

}
