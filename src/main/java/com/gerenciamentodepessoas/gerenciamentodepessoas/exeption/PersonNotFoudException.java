package com.gerenciamentodepessoas.gerenciamentodepessoas.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoudException extends Exception {
    public PersonNotFoudException(Long id) {
        super("Person not found with ID " + id);
    }
}
