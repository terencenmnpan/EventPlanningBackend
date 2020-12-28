package com.terencepan.demo.backend.epa.services;

import com.terencepan.demo.backend.epa.entities.EpaUser;
import com.terencepan.demo.backend.epa.repositories.EpaOrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventMaintenanceService {
    private final EpaOrganizationRepository epaOrganizationRepository;

    @Autowired
    public EventMaintenanceService(EpaOrganizationRepository epaOrganizationRepository) {
        this.epaOrganizationRepository = epaOrganizationRepository;
    }

    public List<EpaUser> getUsersByOrganization(String organizationId){

        return epaOrganizationRepository.findByOrganizationId(organizationId).getOrganizationUsers();
    }
}
