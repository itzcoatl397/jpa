package org.example.spring_jpa_hibertne.repository;

import org.example.spring_jpa_hibertne.entities.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IPersonRepository  extends CrudRepository<Person, Long> {
        List<Person> findByProgrammingLanguage(String  programmingLanguage);
        List<Person> findByName(String name);



}
