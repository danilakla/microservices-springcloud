package com.example.consumerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    //
    @Value("${test}")
    private String exampleProperty;
    @Autowired
    private OrganizationFeignClient organizationFeignClient;

    @GetMapping(value = "/")
    public String getValue() {
       String d= organizationFeignClient.getOrganization();
        return "d";
    }
}
