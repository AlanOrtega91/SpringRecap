package com.example.recap.dao;

import com.example.recap.datasource.PersonRepository;
import com.example.recap.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("mongodb")
public class PersonDataAccessService implements PersonDao {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public int insertPerson(String id, Person person) {
        personRepository.save(new Person(id,person.getName()));

        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return personRepository.findAll();
    }

    @Override
    public int deletePersonById(String id) {
        return 0;
    }

    @Override
    public int updatePerson(String id, Person person) {
        return 0;
    }

    @Override
    public Optional<Person> selectPersonById(String id) {
        return personRepository.findById(id);
    }
}
