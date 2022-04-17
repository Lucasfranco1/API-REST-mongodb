package com.apirest.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Persons")
@Data
public class PersonEntity {
    @Id
    private String id;
    private String name;
    private String lastname;
    private String email;
    private Integer age;

}
