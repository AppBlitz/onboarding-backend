package com.employee_microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_microservice.model.entitys.Area;

public interface AreaRepository extends JpaRepository<Area, Long> {

}
