package br.com.thiago.firststepswithspringboot.service;

import br.com.thiago.firststepswithspringboot.entity.Person;
import br.com.thiago.firststepswithspringboot.utils.MockUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {
        logger.info("###Finding one person");

        Person person = MockUtils.mockPerson(1);
        return person;
    }

    public List<Person> findAll() {
        logger.info("###Finding all persons");
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Person person = MockUtils.mockPerson(i);
            personList.add(person);
        }
        return personList;
    }

    public Person create(Person person) {
        logger.info("###Creating a person");
        return person;
    }

    public Person update(Person person) {
        logger.info("###Updating a person with id: " + person.getId());
        return person;
    }

    public void delete(String id) {
        logger.info("###Deleting person with id: " + id);
    }
}
