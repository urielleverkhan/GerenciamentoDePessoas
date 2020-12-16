package com.gerenciamentodepessoas.gerenciamentodepessoas.controller;


import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.MessageResponseDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import com.gerenciamentodepessoas.gerenciamentodepessoas.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//Não consegui fazer o Lombok funcionar, por isto desenvolvi esta api sem o Lombok e por isto esta um pouco diferente do video.
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;


    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}