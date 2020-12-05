package com.example.recap.datasource;

import com.example.recap.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;


public interface PersonRepository extends MongoRepository<Person, String> {
   Person findByName(String name);
}
