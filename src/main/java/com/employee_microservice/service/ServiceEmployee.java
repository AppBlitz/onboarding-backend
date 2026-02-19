package com.employee_microservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_microservice.model.dto.EmployeeDto;
import com.employee_microservice.model.entitys.Employee;
import com.employee_microservice.repository.EmployeeRepository;
import com.employee_microservice.service.intefacesService.interfaceEmployee;
import com.employee_microservice.util.MapperEmployee;

@Service
public class ServiceEmployee implements interfaceEmployee {

  @Autowired
  EmployeeRepository Employeerepository;

  @Autowired
  MapperEmployee mapperEmployee;

  @Override
  public Employee getEmployeeForID(Long id) {
    Optional<Employee> empl = Employeerepository.findById(id);
    if (empl.isEmpty()) {
    }
    return empl.get();
  }

  @Override
  public Employee saveEmployee(EmployeeDto employeeDto) {
    return Employeerepository.save(mapperEmployee.getDtoToEmployee(employeeDto));
  }

}
