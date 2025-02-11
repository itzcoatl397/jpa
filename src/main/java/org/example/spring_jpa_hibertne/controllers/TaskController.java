package org.example.spring_jpa_hibertne.controllers;


import org.example.spring_jpa_hibertne.entities.Tasks;
import org.example.spring_jpa_hibertne.services.TaskServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/")
@CrossOrigin

@RestControllerAdvice
public class TaskController {


    private final TaskServices taskServices;

    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }


    @GetMapping("/allTask")
    public List<Tasks> getAllTask() {


        return   taskServices.getAllTasks();

    }

    @GetMapping("task/{id}")
    public Tasks getTaskById(@PathVariable("id") Long id) {

        return  this.taskServices.getTaskById(id);

    }
}
