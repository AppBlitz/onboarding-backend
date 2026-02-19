package com.employee_microservice.model.entitys;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "area_positions")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AreaPosition {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_area_positions")
  private Long idAreaPositions;

  @ManyToOne
  @JoinColumn(name = "id_area", nullable = false)
  private Area area;

  @ManyToOne
  @JoinColumn(name = "id_position", nullable = false)
  private Position position;

  @OneToMany(mappedBy = "areaPosition")
  private List<Employee> employees;
}
