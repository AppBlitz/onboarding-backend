package com.employee_microservice.model.entitys;

import jakarta.persistence.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_employee")
  private Long idEmployee;

  @Column(name = "name_one", nullable = false, length = 100)
  private String nameOne;

  @Column(name = "other_name", nullable = false, length = 100)
  private String otherName;

  @Column(name = "first_surname", nullable = false, length = 100)
  private String firstSurname;

  @Column(name = "second_surname", nullable = false, length = 100)
  private String secondSurname;

  @Column(name = "telephone", nullable = false, length = 20)
  private String telephone;

  @Column(name = "address", nullable = false, length = 150)
  private String address;

  @Column(name = "postcode", nullable = false)
  private Integer postcode;

  @ManyToOne
  @JoinColumn(name = "id_city", nullable = false)
  private City city;

  @ManyToOne
  @JoinColumn(name = "id_area_position", nullable = false)
  private AreaPosition areaPosition;

}
