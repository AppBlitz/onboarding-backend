package com.employee_microservice.model.dto;

import com.employee_microservice.model.entitys.AreaPosition;
import com.employee_microservice.model.entitys.City;

import jakarta.validation.constraints.Size;

public record EmployeeDto(String nameOne, String otherName, String firstSurname, String secondSurname, @Size(min = 10, max = 10) String telephone,
                                                                                                                                                String address,
                                                                                                                                                City city,
                                                                                                                                                Integer postcode,
                                                                                                                                                AreaPosition areaPosition,
                                                                                                                                                Long idEmployee) {
}
