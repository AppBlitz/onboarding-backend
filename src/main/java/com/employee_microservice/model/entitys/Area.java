package com.employee_microservice.model.entitys;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "areas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Area {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_area")
  private Long id_area;

  @Column(name = "area_name", nullable = false, length = 100)
  private String areaName;

  @OneToMany(mappedBy = "area")
  private List<AreaPosition> areaPositions;
}
