package com.example.baseservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigureCon {
    @Value("${test}")
    private String exampleProperty;
    @Value("${password}")
    private String examplePropertyPassword;
  @GetMapping(value = "/test")
    public  String getConfigProperty(){


      return exampleProperty;
  }
}

