package com.terencepan.demo.backend.epa.repositories;

import com.terencepan.demo.backend.epa.entities.EpaUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpaUserRepository extends MongoRepository <EpaUser, String> {
    EpaUser findByUserId();
}
