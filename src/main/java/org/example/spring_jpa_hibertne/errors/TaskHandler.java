package org.example.spring_jpa_hibertne.errors;

import org.example.spring_jpa_hibertne.entities.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.NoSuchElementException;
@RestControllerAdvice
public class TaskHandler {


    @ExceptionHandler(NoSuchElementException.class)

    public ResponseEntity<ErrorDTO> noElement(Exception e) {

        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setError(String.valueOf(NoSuchElementException.class.getName()));
        errorDTO.setMessage(e.getMessage());
        errorDTO.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

        errorDTO.setDate(new Date());

        return  ResponseEntity.ok().body(errorDTO);
    }

}
