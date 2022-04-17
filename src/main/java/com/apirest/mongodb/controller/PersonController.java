package com.apirest.mongodb.controller;

import com.apirest.mongodb.entity.PersonEntity;
import com.apirest.mongodb.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping("/person")
    public void save(@RequestBody PersonEntity personEntity){
        personService.savePerson(personEntity);
    }
    @PostMapping("/edit")
    public void updatePerson(@RequestBody PersonEntity personEntity){
        personService.savePerson(personEntity);
    }
    @GetMapping("/list")
    public List<PersonEntity>findAllPersons(){
        return personService.findAllPersons();
    }
    @GetMapping("/list/{id}")
    public PersonEntity findPersonById(@PathVariable String id){
        return personService.findPersonById(id).get();
    }
    @DeleteMapping("/delete/{id}")
    public void deletePersonById(@PathVariable String id){
        personService.deletePersonById(id);
    }


}
