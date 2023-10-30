package br.com.thiago.firststepswithspringboot.Mapper;

import br.com.thiago.firststepswithspringboot.dto.v2.PersonVOv2;
import br.com.thiago.firststepswithspringboot.entity.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {
    public PersonVOv2 convertEntityToVo(Person entity) {
        PersonVOv2 vo = new PersonVOv2();
        vo.setId(entity.getId());
        vo.setFirstName(entity.getFirstName());
        vo.setLastName(entity.getLastName());
        vo.setAddress(entity.getAddress());
        vo.setGender(entity.getGender());
        vo.setBirthday(new Date());
        return vo;
    }

    public Person convertVoToEntity(PersonVOv2 entity) {
        Person person = new Person();
        person.setId(entity.getId());
        person.setFirstName(entity.getFirstName());
        person.setLastName(entity.getLastName());
        person.setAddress(entity.getAddress());
        person.setGender(entity.getGender());
        return person;
    }
}
