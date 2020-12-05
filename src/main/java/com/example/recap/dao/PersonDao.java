package com.example.recap.dao;

import com.example.recap.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(String id, Person person);

    default int insertPerson(Person person){
        String id = UUID.randomUUID().toString();
        return insertPerson(id,person);
    }

    List<Person> selectAllPeople();

    int deletePersonById(String id);

    int updatePerson(String id, Person person);

    Optional<Person> selectPersonById(String id);
}
