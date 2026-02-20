package com.employee_microservice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee_microservice.mappers.ModelMappers;
import com.employee_microservice.model.dto.EmployeeDto;
import com.employee_microservice.model.entitys.Employee;

@Component
public class MapperEmployee {

  @Autowired
  private ModelMappers modelMappers;

  public Employee getDtoToEmployee(EmployeeDto employeeDto) {
    return modelMappers.modelMapper().map(employeeDto, Employee.class);
  }

  public EmployeeDto getEmployeeToDto(Employee employee) {
    return modelMappers.modelMapper().map(employee, EmployeeDto.class);
  }

}
