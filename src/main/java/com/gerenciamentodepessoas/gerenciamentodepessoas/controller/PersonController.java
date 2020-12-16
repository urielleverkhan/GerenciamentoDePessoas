package com.gerenciamentodepessoas.gerenciamentodepessoas.controller;


import com.gerenciamentodepessoas.gerenciamentodepessoas.dto.MessageREsponseDTO;
import com.gerenciamentodepessoas.gerenciamentodepessoas.entity.Person;
import com.gerenciamentodepessoas.gerenciamentodepessoas.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Não consegui fazer o Lombok funcionar, por isto desenvolvi esta api sem o Lombok e por isto esta um pouco diferente do video.
@RestController
@RequestMapping("/api/v1/people")
public class PersonController {


    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageREsponseDTO createPerson(@RequestBody Person person) {
        Person savedPerson = personRepository.save(person);
        return new MessageREsponseDTO("Create person with ID " + savedPerson.getId());

    }
}