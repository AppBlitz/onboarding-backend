package com.employee_microservice.service.intefacesService;

import com.employee_microservice.model.dto.EmployeeDto;
import com.employee_microservice.model.entitys.Employee;

public interface interfaceEmployee {
  /**
   * @param id
   * @return Employee
   *         Method that receives the employee's unique identifier as a parameter
   *         and returns
   */
  public Employee getEmployeeForID(Long id);

  /**
   * @param employeeDto
   * @return Employee
   *         Method that receives a DTO class and saves the employee in the
   *         database
   */
  public Employee saveEmployee(EmployeeDto employeeDto);
}
