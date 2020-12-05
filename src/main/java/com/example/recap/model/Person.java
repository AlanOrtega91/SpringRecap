package com.example.recap.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document("Person")
public class Person {
    @Id
    private final String id;
    @NotBlank
    private final String name;

    public Person(@JsonProperty("id") String id,
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}
