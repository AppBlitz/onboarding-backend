package com.employee_microservice.model.entity;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {
  String nameOne;
  String otherName;
  String firsSurname;
  String secondSurname;
  @Max(10)
  @Min(10)
  String telephone;
  String addres;
  String city;
  String postcode;
  Position position;
  Area area;
  String numberEmployee;

}
