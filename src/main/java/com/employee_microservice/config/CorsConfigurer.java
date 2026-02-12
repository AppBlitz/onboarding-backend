package com.employee_microservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfigurer {

  @Value("${spring.cors.hostOne}")
  private String hostOne;

  @Value("${spring.cors.hostTwo}")
  private String hostTwo;

  @Value("${spring.cors.hostThree}")

  private String hostTree;

  private String[] origins = { hostOne, hostTwo, hostTree };

  @Bean("configurerCors")
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/employee/update").allowedOrigins(origins).allowedMethods("POST");
        corsRegistry.addMapping("/employee/retrieve").allowedOrigins(origins).allowedMethods("GET");
      }
    };
  }

}
