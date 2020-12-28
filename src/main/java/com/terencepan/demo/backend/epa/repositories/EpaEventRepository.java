package com.terencepan.demo.backend.epa.repositories;

import com.terencepan.demo.backend.epa.entities.EpaEvent;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EpaEventRepository {
    List<EpaEvent> findByOrganizationId(String organizationId);
}
