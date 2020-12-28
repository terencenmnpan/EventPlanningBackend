package com.terencepan.demo.backend.epa.controllers;

import com.terencepan.demo.backend.epa.entities.EpaUser;
import com.terencepan.demo.backend.epa.services.EventMaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/organization")
public class UserManagementController {

    private final EventMaintenanceService eventMaintenanceService;

    @Autowired
    public UserManagementController(EventMaintenanceService eventMaintenanceService) {
        this.eventMaintenanceService = eventMaintenanceService;
    }

    @GetMapping("/getUsers")
    public List<EpaUser> getOrganizationUsers(@RequestParam(value = "organizationId") String organizationId){
        return eventMaintenanceService.getUsersByOrganization(organizationId);
    }

}
