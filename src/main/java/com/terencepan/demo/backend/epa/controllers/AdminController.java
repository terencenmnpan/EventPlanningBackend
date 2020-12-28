package com.terencepan.demo.backend.epa.controllers;

import com.terencepan.demo.backend.epa.dtos.CreateOrganizationDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/admin")
public class AdminController {
    @PostMapping("/create-organization")
    public void createOrganization(@RequestBody CreateOrganizationDto createOrganizationDto){

    }
}
