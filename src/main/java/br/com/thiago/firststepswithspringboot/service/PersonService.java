package br.com.thiago.firststepswithspringboot.service;

import br.com.thiago.firststepswithspringboot.entity.Person;
import br.com.thiago.firststepswithspringboot.exceptions.ResourceNotFoundException;
import br.com.thiago.firststepswithspringboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonService {
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    @Autowired
    private PersonRepository repository;

    public Person findById(Long id) {
        logger.info("###Finding one person");
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
    }

    public List<Person> findAll() {
        logger.info("###Finding all persons");
        return repository.findAll();
    }

    public Person create(Person person) {
        logger.info("###Creating a person");
        return repository.save(person);
    }

    public Person update(Person person) {
        logger.info("###Updating a person with id: " + person.getId());

        var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return repository.save(entity);
    }

    public void delete(Long id) {
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        logger.info("###Deleting person with id: " + id);
        repository.delete(entity);
    }
}
