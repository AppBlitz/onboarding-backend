package com.employee_microservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee_microservice.model.dto.EmployeeDtoRequest;
import com.employee_microservice.model.dto.EmployeeDtoResponse;
import com.employee_microservice.model.entitys.City;
import com.employee_microservice.model.entitys.Employee;
import com.employee_microservice.model.entitys.Position;
import com.employee_microservice.repository.CityRepository;
import com.employee_microservice.repository.EmployeeRepository;
import com.employee_microservice.repository.PositionRepository;
import com.employee_microservice.service.intefacesService.interfaceEmployee;


@Service
public class ServiceEmployee implements interfaceEmployee {

  @Autowired
  EmployeeRepository Employeerepository;

  @Autowired
  CityRepository Cityrepository;

  @Autowired
  PositionRepository Positionrepository;


  @Override
  public EmployeeDtoResponse getEmployeeForID(Long id) {

    Employee employee = Employeerepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found"));

    //aqui faltaria obtener el nombre del departamento del otro servicio
    return new EmployeeDtoResponse(
            employee.getIdEmployee(),
            employee.getNameOne(),
            employee.getOtherName(),
            employee.getFirstSurname(),
            employee.getSecondSurname(),
            employee.getTelephone(),
            employee.getAddress(),
            employee.getPostcode(),
            employee.getCity().getNameCity(),
            employee.getPosition().getPositionName(),
            employee.getDepartmentId()
    );
}
  

  @Override
  public Employee saveEmployee(EmployeeDtoRequest employeeDto) {

        //validaciones

        City city = Cityrepository.findById(employeeDto.cityId())
            .orElseThrow(() -> new RuntimeException("City not found"));
        Position position = Positionrepository.findById(employeeDto.positionId())
            .orElseThrow(() -> new RuntimeException("Position not found"));


        //falta validar el departamento aqui para agregarlo

    
    Employee employee = new Employee();

    employee.setIdEmployee(employeeDto.idEmployee());
    employee.setNameOne(employeeDto.nameOne());
    employee.setOtherName(employeeDto.otherName());
    employee.setFirstSurname(employeeDto.firstSurname());
    employee.setSecondSurname(employeeDto.secondSurname());
    employee.setTelephone(employeeDto.telephone());
    employee.setAddress(employeeDto.address());
    employee.setPostcode(employeeDto.postcode());
    employee.setCity(city);
    employee.setPosition(position);
    employee.setDepartmentId(employeeDto.departmentId());

    return Employeerepository.save(employee);
  }
  
}
