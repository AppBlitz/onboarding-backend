package com.employee_microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee_microservice.model.dto.EmployeeDto;

@RestController
@RequestMapping("/user")
public class ControllerEmployee {

  @RequestMapping(path = "/retrieve/{idEmployee}", produces = "application/json", method = RequestMethod.GET)
  public void retrieveEmployee(@PathVariable("idEmployee") String idEmployee) {

  }

  @RequestMapping(path = "/update", produces = "application/json", method = RequestMethod.POST)
  public ResponseEntity<EmployeeDto> updateEmployee() {
    return ResponseEntity.ok(null);
  }

}
