package com.employee_microservice.service.intefacesService;

import com.employee_microservice.model.dto.EmployeeDtoRequest;
import com.employee_microservice.model.dto.EmployeeDtoResponse;
import com.employee_microservice.model.entitys.Employee;

public interface interfaceEmployee {
  /**
   * @param id
   * @return Employee
   *         Method that receives the employee's unique identifier as a parameter
   *         and returns EmployeeDtoResponse
   */
  public EmployeeDtoResponse getEmployeeForID(Long id);

  /**
   * @param employeeDto
   * @return Employee
   *         Method that receives a DTO class and saves the employee in the
   *         database
   */
  public Employee saveEmployee(EmployeeDtoRequest employeeDto);
}
