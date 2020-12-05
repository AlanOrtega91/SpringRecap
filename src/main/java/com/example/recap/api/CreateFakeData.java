package com.example.recap.api;

import com.example.recap.datasource.PersonRepository;
import com.example.recap.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("api/v1/fake")
@RestController
public class CreateFakeData {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    public void createFakes(){
        personRepository.save(new Person(UUID.randomUUID().toString(),"Juan"));
        personRepository.save(new Person(UUID.randomUUID().toString(),"Pedro"));
        personRepository.save(new Person(UUID.randomUUID().toString(),"Ramon"));
        personRepository.save(new Person(UUID.randomUUID().toString(),"Castro"));
        personRepository.save(new Person(UUID.randomUUID().toString(),"Alan"));
        personRepository.save(new Person(UUID.randomUUID().toString(),"Eugenio"));
    }
}
