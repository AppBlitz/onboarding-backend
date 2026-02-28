package com.employee_microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee_microservice.model.dto.EmployeeDtoRequest;
import com.employee_microservice.model.dto.EmployeeDtoResponse;
import com.employee_microservice.service.ServiceEmployee;
import com.employee_microservice.util.MapperEmployee;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class ControllerEmployee {

  @Autowired
  ServiceEmployee serviceEmployee;

  @Autowired
  MapperEmployee mapperEmployee;

  @GetMapping(path = "/retrieve/{idEmployee}", produces = "application/json")
  public ResponseEntity<EmployeeDtoResponse> retrieveEmployee(@PathVariable("idEmployee") Long idEmployee) {
    return ResponseEntity.ok((serviceEmployee.getEmployeeForID(idEmployee)));
  }

  @PostMapping(path = "/add", produces = "application/json")
  public ResponseEntity<EmployeeDtoRequest> updateEmployee(@Valid @RequestBody EmployeeDtoRequest employeeDto) {
    return ResponseEntity.ok(mapperEmployee.getEmployeeToDto(serviceEmployee.saveEmployee(employeeDto)));
  }

}
