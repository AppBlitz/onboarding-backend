package com.employee_microservice.model.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  @Id
  @Column(name = "id_employee")
  private Long id_employee;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "name_one", nullable = false, length = 100)
  private String name_one;

  @Column(name = "other_name", nullable = true, length = 100)
  private String other_name;

  @Column(name = "first_surname", nullable = false, length = 100)
  private String first_surname;

  @Column(name = "second_surname", nullable = false, length = 100)
  private String second_surname;

  @Column(name = "telephone", nullable = false, length = 20)
  private String telephone;

  @Column(name = "address", nullable = true, length = 150)
  private String address;

  @Column(name = "postcode")
  private Integer postcode;

  @Column(name = "citye_name", nullable = false)
  private String city_name;

  @Column(name = "id_position", nullable = false)
  private String position;

  @JoinColumn(name = "id_department", nullable = false)
  private Long department_id;

}
