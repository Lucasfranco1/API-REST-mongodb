package com.apirest.mongodb.service;

import com.apirest.mongodb.entity.PersonEntity;
import com.apirest.mongodb.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public void savePerson(PersonEntity person){
        personRepository.save(person);
    }

    public List<PersonEntity>findAllPersons(){
        return personRepository.findAll();
    }
    public Optional<PersonEntity> findPersonById(String idPerson){
        return personRepository.findById(idPerson);
    }
    public void deletePersonById(String idPerson){
        personRepository.deleteById(idPerson);
    }




}
