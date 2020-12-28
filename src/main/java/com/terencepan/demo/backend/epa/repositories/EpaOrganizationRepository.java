package com.terencepan.demo.backend.epa.repositories;

import com.terencepan.demo.backend.epa.entities.EpaOrganization;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpaOrganizationRepository extends MongoRepository<EpaOrganizationRepository, String> {

    EpaOrganization findByOrganizationId(String organizationId);

}
