package com.employee_microservice.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public interface EmployeeMapper {

  @Bean
  public static ModelMapper modelMapper() {
    return new ModelMapper();
  }

}
