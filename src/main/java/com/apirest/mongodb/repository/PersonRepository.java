package com.apirest.mongodb.repository;

import com.apirest.mongodb.entity.PersonEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends MongoRepository<PersonEntity, String> {

}
