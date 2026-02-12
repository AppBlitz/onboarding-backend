package com.employee_microservice.model.dto;

import java.awt.geom.Area;

import com.employee_microservice.model.entity.Position;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record EmployeeDto(
        String nameOne,
        String otherName,
        String firstSurname,
        String secondSurname,
        @Max(10) @Min(10) String telephone,
        String address, String City, String postCode, Position position,
        Area area, String numberEmployee) {
}
