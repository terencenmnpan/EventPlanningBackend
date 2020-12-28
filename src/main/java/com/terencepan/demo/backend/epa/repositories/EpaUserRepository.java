package com.terencepan.demo.backend.epa.repositories;

import com.terencepan.demo.backend.epa.entities.EpaUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EpaUserRepository extends MongoRepository <EpaUser, String> {

}
