package com.employee_microservice.model.dto;

import jakarta.validation.constraints.Size;


public record EmployeeDtoRequest(
    Long idEmployee,
    String nameOne,
    String otherName,
    String firstSurname,
    String secondSurname,
    @Size(min = 10, max = 10) String telephone,
    String address,
    Integer postcode,

    Long cityId,
    Long positionId,
    String departmentId
) {}
