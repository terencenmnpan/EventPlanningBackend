package com.terencepan.demo.backend.epa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.terencepan.demo.backend.epa.services",
        "com.terencepan.demo.backend.epa.entities",
        "com.terencepan.demo.backend.epa.repositories"})
public class EventPlanningBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventPlanningBackendApplication.class, args);
    }

}
