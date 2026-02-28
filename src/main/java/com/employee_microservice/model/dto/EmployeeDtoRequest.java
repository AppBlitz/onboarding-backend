package com.employee_microservice.model.dto;

import com.sun.istack.NotNull;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;

public record EmployeeDtoRequest(
        @NotNull long id_employee,
        @NotNull String name_one,
        @Null String other_name,
        @NotNull String first_surname,
        @NotNull String second_surname,
        @Size(min = 10, max = 10) String telephone,
        @Null String address,
        Integer postcode,
        @Email @NotNull String email,
        @Null String city_name,
        @NotNull String position_name,
        long department_id) {
}
