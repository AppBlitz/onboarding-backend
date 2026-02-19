package com.employee_microservice.service.intefacesService;

import com.employee_microservice.model.dto.EmployeeDto;
import com.employee_microservice.model.entitys.Employee;

public interface interfaceEmployee {
  public Employee getEmployeeForID(Long id);

  public Employee saveEmployee(EmployeeDto employeeDto);
}
