package com.terencepan.demo.backend.epa.repositories;

import com.terencepan.demo.backend.epa.entities.EpaEvent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpaEventRepository  extends MongoRepository<EpaEvent, String> {
    List<EpaEvent> findByOrganizationId(String organizationId);
}
