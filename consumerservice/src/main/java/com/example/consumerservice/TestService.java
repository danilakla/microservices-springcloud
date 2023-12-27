package com.example.consumerservice;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private OrganizationFeignClient organizationFeignClient;
    @CircuitBreaker(name = "testa", fallbackMethod = "methodFallBack")
   // @Retry(name = "testb")

    public String callbaseserver() {
            return  organizationFeignClient.getOrganization();
    }

    private  String methodFallBack( Exception e){
        System.out.println("call or not");
        return  "nono";
    }
}
