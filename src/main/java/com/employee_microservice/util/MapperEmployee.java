package com.employee_microservice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee_microservice.mappers.ModelMappers;
import com.employee_microservice.model.dto.EmployeeDtoRequest;
import com.employee_microservice.model.entitys.Employee;

@Component
public class MapperEmployee {

  @Autowired
  private ModelMappers modelMappers;

  public Employee getDtoToEmployee(EmployeeDtoRequest employeeDto) {
    return modelMappers.modelMapper().map(employeeDto, Employee.class);
  }

  public EmployeeDtoRequest getEmployeeToDto(Employee employee) {

    return new EmployeeDtoRequest(
        employee.getId_employee(),
        employee.getName_one(),
        employee.getOther_name(),
        employee.getFirst_surname(),
        employee.getSecond_surname(),
        employee.getTelephone(),
        employee.getAddress(),
        employee.getPostcode(),
        employee.getEmail(),
        employee.getCity_name(),
        employee.getPosition(),
        employee.getDepartment_id());
  }

}
