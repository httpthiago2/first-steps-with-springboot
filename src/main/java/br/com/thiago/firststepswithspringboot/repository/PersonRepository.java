package br.com.thiago.firststepswithspringboot.repository;

import br.com.thiago.firststepswithspringboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
