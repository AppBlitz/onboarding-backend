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

  //  public EmployeeDtoRequest getEmployeeToDto(Employee employee) {
  //    return modelMappers.modelMapper().map(employee, EmployeeDtoRequest.class);
  //  }

   public EmployeeDtoRequest getEmployeeToDto(Employee employee) {
     //return modelMappers.modelMapper().map(employee, EmployeeDtoRequest.class);

     return new EmployeeDtoRequest(
            employee.getIdEmployee(),
            employee.getNameOne(),
            employee.getOtherName(),
            employee.getFirstSurname(),
            employee.getSecondSurname(),
            employee.getTelephone(),
            employee.getAddress(),
            employee.getPostcode(),
            employee.getCity().getIdCity(),
            employee.getPosition().getIdPosition(),
            employee.getDepartmentId()
     );
   }




}
