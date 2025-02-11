package org.example.spring_jpa_hibertne;

import org.example.spring_jpa_hibertne.entities.Person;

import org.example.spring_jpa_hibertne.entities.Tasks;
import org.example.spring_jpa_hibertne.repository.IPersonRepository;
import org.example.spring_jpa_hibertne.repository.ITaskRepository;
import org.example.spring_jpa_hibertne.utils.TaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public abstract class SpringJpaHibertneApplication implements CommandLineRunner {

    @Autowired
    private   IPersonRepository repository;

    @Autowired
    private  ITaskRepository taskRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringJpaHibertneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //List<Person> personList = (List<Person>) repository.findAll();
        List<Person> personList = (List<Person>) repository.findAll();
        List<Tasks> tasksList =(List<Tasks>) taskRepository.findByStatus(TaskStatus.IN_PROGRESS);

        Optional<Tasks> tasksList2 =  taskRepository.findById(2L);

        personList.forEach(person -> System.out.println(person.toString()));

        tasksList.forEach(task -> System.out.println(task.toString()));


        System.out.println(tasksList2.get());

    }
}