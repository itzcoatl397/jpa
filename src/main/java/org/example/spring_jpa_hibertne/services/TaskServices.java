package org.example.spring_jpa_hibertne.services;

import jakarta.transaction.Transactional;

import org.example.spring_jpa_hibertne.entities.Tasks;
import org.example.spring_jpa_hibertne.repository.ITaskRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServices {

    private final  ITaskRepository taskRepository;

    public TaskServices(ITaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }



    @Transactional
    public Tasks getTaskById(Long id) {
        Tasks task = taskRepository.findById(id).get();


        return  task;
    }

    @Transactional
    public List<Tasks> getAllTasks() {

        return (List<Tasks>) this.taskRepository.findAll();
    }
}
