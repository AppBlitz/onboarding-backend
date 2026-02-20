package com.employee_microservice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.employee_microservice.model.dto.EmployeeDto;
import com.employee_microservice.model.entitys.Area;
import com.employee_microservice.model.entitys.AreaPosition;
import com.employee_microservice.model.entitys.City;
import com.employee_microservice.model.entitys.Employee;
import com.employee_microservice.model.entitys.Position;
import com.employee_microservice.util.MapperEmployee;

@SpringBootTest
class EmployeeMicroserviceApplicationTests {
  @Autowired
  MapperEmployee mapperEmployee;

  @Test
  void contextLoads() {

  }

  @Test
  void verificationMapper() {
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<AreaPosition> positions = new ArrayList<>();
    Position position = new Position(34576L, "no se", positions);
    Area area = new Area(987654L, "Computer ciencie", positions);
    AreaPosition areaPosition = new AreaPosition(56789L, area, position, employees);
    City city = new City(3456L, "Londres", employees);
    EmployeeDto employeeDto = new EmployeeDto("Luis", "fernando", "castro",
        "urrea", "3124567890", "Calle 23 56#45",
        city,
        123456, areaPosition, 654321L);
    assertNotNull(mapperEmployee.getDtoToEmployee(employeeDto));
  }

}
