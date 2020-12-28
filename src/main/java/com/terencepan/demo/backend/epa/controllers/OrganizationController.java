package com.terencepan.demo.backend.epa.controllers;

import com.terencepan.demo.backend.epa.entities.EpaUser;
import com.terencepan.demo.backend.epa.repositories.EpaOrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/organization")
public class OrganizationController {

    @Autowired
    EpaOrganizationRepository epaOrganizationRepository;

    @GetMapping("/getUsers")
    public List<EpaUser> getOrganizationUsers(@RequestParam(value = "organizationId") String organizationId){
        return epaOrganizationRepository.findByOrganizationId(organizationId).getOrganizationUsers();
    }


}
