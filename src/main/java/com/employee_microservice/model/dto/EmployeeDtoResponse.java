package com.employee_microservice.model.dto;


public record EmployeeDtoResponse(
    Long idEmployee,
    String nameOne,
    String otherName,
    String firstSurname,
    String secondSurname,
    String telephone,
    String address,
    Integer postcode,

    String cityName,
    String positionName,
    String departmentName
) {}
