package com.employee_microservice.model.dto;

import com.sun.istack.NotNull;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Null;

public record EmployeeDtoResponse(
        Long id_employee,
        @NotNull String name_one,
        @Null String other_name,
        @NotNull String first_surname,
        @NotNull String second_surname,
        @NotNull String telephone,
        @Null String address,
        Integer postcode,
        @NotNull @Email String email,
        @Null String city_name,
        @NotNull String position_name,
        Long department_id) {
}
