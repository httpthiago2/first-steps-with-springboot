package br.com.thiago.firststepswithspringboot.utils;

import br.com.thiago.firststepswithspringboot.entity.Person;

import java.util.concurrent.atomic.AtomicLong;

public class MockUtils {
    private static final AtomicLong counter = new AtomicLong();
    public static Person mockPerson(int i) {
        Person person = new Person(
                counter.incrementAndGet(),
                "First name " + i,
                "Last name " + i,
                "Avenida " + i,
                "MASCULINO"
        );
        return person;
    }
}
