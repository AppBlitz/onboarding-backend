package com.employee_microservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_microservice.model.entitys.City;

public interface CityRepository extends JpaRepository<City, Long> {


}
