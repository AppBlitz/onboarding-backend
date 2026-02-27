package com.employee_microservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_microservice.model.entitys.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {

  Optional<Position> findByIdPosition(Long id);
} 

