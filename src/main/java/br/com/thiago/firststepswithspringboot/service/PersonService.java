package br.com.thiago.firststepswithspringboot.service;

import br.com.thiago.firststepswithspringboot.Mapper.DozerMapper;
import br.com.thiago.firststepswithspringboot.dto.v1.PersonVO;
import br.com.thiago.firststepswithspringboot.entity.Person;
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

    public PersonVO findById(Long id) {
        logger.info("###Finding one person");
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        return DozerMapper.parseObject(entity, PersonVO.class);
    }

    public List<PersonVO> findAll() {
        logger.info("###Finding all persons");
        return DozerMapper.parseListObjects(repository.findAll(), PersonVO.class);
    }

    public PersonVO create(PersonVO person) {
        logger.info("###Creating a person");
        Person newPerson = DozerMapper.parseObject(person, Person.class);
        return DozerMapper.parseObject(repository.save(newPerson), PersonVO.class);
    }

    public PersonVO update(PersonVO person) {
        logger.info("###Updating a person with id: " + person.getId());

        var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        entity.setGender(person.getGender());

        return DozerMapper.parseObject(repository.save(entity), PersonVO.class);
    }

    public void delete(Long id) {
        var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        logger.info("###Deleting person with id: " + id);
        repository.delete(entity);
    }
}
