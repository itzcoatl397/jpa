package org.example.spring_jpa_hibertne.repository;


import org.example.spring_jpa_hibertne.entities.Tasks;
import org.example.spring_jpa_hibertne.utils.TaskStatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;

import java.util.List;




public interface ITaskRepository extends  CrudRepository<Tasks, Long> {

    List<Tasks> findByStatus(TaskStatus status);




}
